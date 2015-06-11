package main;

import main.commands.Command;

public class Interpreter {

    private Tape tape;
    private Expression expression;

    public Interpreter(String source) {
        tape = new Tape();
        expression = Parser.parse(source);
    }

    public void interpret() throws Exception {
        expression.interpret(tape);
    }

    public void addCommand(Command command) {
        expression.add(command);
    }

    public void removeCommand(Command command) {
        expression.remove(command);
    }
}
