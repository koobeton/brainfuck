package main;

import main.commands.Command;
import main.commands.CommandFactory;
import main.commands.LoopCommand;

public class Parser {

    private static String source;
    private static int charPointer;

    public static Expression parse(String rawSource) {

        Expression expression = new Expression();

        spellCheck(rawSource);
        charPointer = 0;

        while (charPointer < source.length()) {
            expression.add(getCommand());
        }

        return expression;
    }

    private static Command getCommand() {

        char c = source.charAt(charPointer++);

        switch (c) {
            case Command.NEXT:
                return CommandFactory.getNext();
            case Command.PREVIOUS:
                return CommandFactory.getPrevious();
            case Command.INCREASE:
                return CommandFactory.getIncrease();
            case Command.DECREASE:
                return CommandFactory.getDecrease();
            case Command.OUT:
                return CommandFactory.getOut();
            case Command.IN:
                return CommandFactory.getIn();
            case Command.LEFT_BRACKET:
                LoopCommand loop = CommandFactory.getLoop();
                Command innerCommand;
                while ((innerCommand = getCommand()) != null) {
                    loop.add(innerCommand);
                }
                return loop;
            case Command.RIGHT_BRACKET:
                return null;
            default:
                throw new IllegalArgumentException("Brainfuck syntax error: unexpected character: " + c);
        }
    }

    private static void spellCheck(String string) {

        source = string.replaceAll("[^><+-.,\\[\\]]", "");

        int count = source.replaceAll("[^\\[]", "").length() - source.replaceAll("[^\\]]", "").length();
        if (count != 0) {
            throw new IllegalArgumentException(
                    String.format("Brainfuck syntax error: Missing %d %s bracket%s '%s'",
                            Math.abs(count),
                            count > 0 ? "closing" : "opening",
                            Math.abs(count) == 1 ? "" : "s",
                            count > 0 ? Command.RIGHT_BRACKET : Command.LEFT_BRACKET
                    )
            );
        }
    }
}
