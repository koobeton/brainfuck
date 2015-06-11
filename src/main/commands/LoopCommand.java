package main.commands;

import main.Tape;

import java.util.ArrayList;
import java.util.List;

public class LoopCommand implements Command {

    private List<Command> children = new ArrayList<>();

    @Override
    public void interpret(Tape tape) throws Exception {
        while (tape.isNotZero()) {
            for (Command command : children) {
                command.interpret(tape);
            }
        }
    }

    public void add(Command command) {
        children.add(command);
    }
}
