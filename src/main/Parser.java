package main;

import main.commands.Command;
import main.commands.CommandFactory;

public class Parser {

    public static Expression parse(String source) {

        Expression expression = new Expression();

        source = source.replaceAll("[^><+-.,\\[\\]]", "");

        int charPointer = 0;

        while (charPointer < source.length()) {
            expression.add(parse(source.charAt(charPointer++)));
        }

        return expression;
    }

    private static Command parse(char c) {

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
            case Command.RIGHT_BRACKET:
                return CommandFactory.getLoop();
            case Command.LEFT_BRACKET:
                return null;
            default:
                throw new IllegalArgumentException("Syntax error: unexpected character: " + c);
        }
    }
}
