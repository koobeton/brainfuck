package main.commands;

import main.Tape;

public class OutCommand implements Command {

    @Override
    public void interpret(Tape tape) {
        tape.out();
    }
}
