package main.commands;

import main.Tape;

/**
 * Represents a Brainfuck <b>' &#046; '</b> command.
 *
 * @see CommandFactory
 * @see Command
 * */
public class OutCommand implements Command {

    /**
     * {@inheritDoc}
     * */
    @Override
    public void interpret(Tape tape) {
        tape.out();
    }
}
