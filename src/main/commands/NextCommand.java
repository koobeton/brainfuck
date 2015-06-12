package main.commands;

import main.Tape;

/**
 * Represents a Brainfuck <b>' &gt; '</b> command.
 *
 * @see CommandFactory
 * @see Command
 * */
public class NextCommand implements Command {

    /**
     * {@inheritDoc}
     * */
    @Override
    public void interpret(Tape tape) {
        tape.next();
    }
}
