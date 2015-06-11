package main.commands;

import main.Tape;

public class PreviousCommand implements Command {

    @Override
    public void interpret(Tape tape) {
        tape.previous();
    }
}
