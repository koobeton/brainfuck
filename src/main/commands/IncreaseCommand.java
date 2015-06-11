package main.commands;

import main.Tape;

public class IncreaseCommand implements Command {

    @Override
    public void interpret(Tape tape) {
        tape.increase();
    }
}
