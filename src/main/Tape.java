package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tape {

    private static final byte NEW_CELL = 0;

    private List<Byte> tape = new ArrayList<>();
    private int pointer;

    Tape() {
        pointer = 0;
        tape.add(NEW_CELL);
    }

    public void next() {
        if (++pointer > tape.size() - 1) {
            tape.add(NEW_CELL);
        }
    }

    public void previous() {
        if (pointer <= 0) {
            pointer = 0;
            tape.add(0, NEW_CELL);
        } else {
            --pointer;
        }
    }

    public void increase() {
        tape.set(pointer, (byte)(tape.get(pointer) + 1));
    }

    public void decrease() {
        tape.set(pointer, (byte)(tape.get(pointer) - 1));
    }

    public void out() {
        System.out.print(Character.valueOf((char)Byte.toUnsignedInt(tape.get(pointer))));
    }

    public void in() throws IOException {
        tape.set(pointer, (byte)System.in.read());
        System.in.skip(System.in.available());
    }

    public boolean isNotZero() {
        return tape.get(pointer) != 0;
    }
}
