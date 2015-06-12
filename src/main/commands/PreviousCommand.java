package main.commands;

import main.Tape;

/**
 * Represents a Brainfuck <b>' &lt; '</b> command.
 *
 * @see CommandFactory
 * @see Command
 * */
public class PreviousCommand implements Command {

    /**
     * {@inheritDoc}
     * */
    @Override
    public void interpret(Tape tape) {
        tape.previous();
    }
}
