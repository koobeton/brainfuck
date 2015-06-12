package main.commands;

import main.Tape;

/**
 * Represents a Brainfuck <b>' + '</b> command.
 *
 * @see CommandFactory
 * @see Command
 * */
public class IncreaseCommand implements Command {

    /**
     * {@inheritDoc}
     * */
    @Override
    public void interpret(Tape tape) {
        tape.increase();
    }
}
