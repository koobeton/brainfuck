package main;

import main.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Expression implements Command {

    private List<Command> children = new ArrayList<>();

    @Override
    public void interpret(Tape tape) throws Exception {
        for (Command command : children) {
            command.interpret(tape);
        }
    }

    public void add(Command command) {
        children.add(command);
    }

    public void remove(Command command) {
        children.remove(command);
    }
}
