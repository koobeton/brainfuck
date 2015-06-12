package main;

import main.commands.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an expression of the Brainfuck commands.
 *
 * @see Command
 * */
public class Expression implements Command {

    private List<Command> children = new ArrayList<>();

    /**
     * Interprets this {@code Expression} of the Brainfuck {@code Command}s
     * at the specified context (a {@link Tape}).
     *
     * @param tape a context at which this expression must be interpreted.
     * */
    @Override
    public void interpret(Tape tape) throws Exception {
        for (Command command : children) {
            command.interpret(tape);
        }
    }

    /**
     * Adds a specified {@code Command} to this {@code Expression}.
     *
     * @param command command to be added.
     *
     * @see Command
     * */
    public void add(Command command) {
        children.add(command);
    }

    /**
     * Removes the first occurrence of the specified {@code Command} from this {@code Expression},
     * if it is present.
     *
     * @param command command to be removed.
     *
     * @see Command
     * */
    public void remove(Command command) {
        children.remove(command);
    }
}
