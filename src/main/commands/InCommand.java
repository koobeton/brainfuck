package main.commands;

import main.Tape;

import java.io.IOException;

public class InCommand implements Command {

    @Override
    public void interpret(Tape tape) throws IOException {
        tape.in();
    }
}
