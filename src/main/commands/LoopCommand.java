package main.commands;

import main.Tape;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Brainfuck <b>' [ '</b> and <b>' ] '</b> commands.
 *
 * @see CommandFactory
 * @see Command
 * */
public class LoopCommand implements Command {

    private List<Command> children = new ArrayList<>();

    /**
     * {@inheritDoc}
     * */
    @Override
    public void interpret(Tape tape) throws Exception {
        while (tape.isNotZero()) {
            for (Command command : children) {
                command.interpret(tape);
            }
        }
    }

    /**
     * Adds a specified {@code Command} to this {@code LoopCommand}.
     *
     * @param command command to be added.
     *
     * @see Command
     * */
    public void add(Command command) {
        children.add(command);
    }
}
