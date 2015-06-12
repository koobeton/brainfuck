package main;

import main.commands.Command;

/**
 * Main class that represents an interpreter of a Brainfuck source code.
 * */
public class Interpreter {

    private Tape tape;
    private Expression expression;

    /**
     * Constructs a new {@code Interpreter} object with a specified Brainfuck source code.
     *
     * @param source Brainfuck source code.
     * */
    public Interpreter(String source) {
        tape = new Tape();
        expression = Parser.parse(source);
    }

    /**
     * Interprets the given Brainfuck source code.
     * */
    public void interpret() throws Exception {
        expression.interpret(tape);
    }

    /**
     * Adds a specified {@code Command} to this {@code Interpreter}.
     *
     * @param command command to be added.
     *
     * @see Expression
     * @see Command
     * */
    public void addCommand(Command command) {
        expression.add(command);
    }

    /**
     * Removes the first occurrence of the specified {@code Command} from this {@code Interpreter},
     * if it is present.
     *
     * @param command command to be removed.
     *
     * @see Expression
     * @see Command
     * */
    public void removeCommand(Command command) {
        expression.remove(command);
    }
}
