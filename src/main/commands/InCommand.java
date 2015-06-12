package main.commands;

import main.Tape;

import java.io.IOException;

/**
 * Represents a Brainfuck <b>' , '</b> command.
 *
 * @see CommandFactory
 * @see Command
 * */
public class InCommand implements Command {

    /**
     * {@inheritDoc}
     * */
    @Override
    public void interpret(Tape tape) throws IOException {
        tape.in();
    }
}
