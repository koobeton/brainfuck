package main.commands;

import main.Tape;

public class DecreaseCommand implements Command {

    @Override
    public void interpret(Tape tape) {
        tape.decrease();
    }
}
