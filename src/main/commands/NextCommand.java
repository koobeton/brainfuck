package main.commands;

import main.Tape;

public class NextCommand implements Command {

    @Override
    public void interpret(Tape tape) {
        tape.next();
    }
}
