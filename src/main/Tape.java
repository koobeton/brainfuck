package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Brainfuck machine.
 *
 * Unlike the classical representation of Brainfuck language
 * in which the machine is limited to 30,000 cells,
 * this implementation includes the machine with tape, dynamically extensible in both directions.
 *
 * Each cell's size is 1 byte.
 * */
public class Tape {

    private static final byte NEW_CELL = 0;

    private List<Byte> tape = new ArrayList<>();
    private int pointer;

    /**
     * Constructs a new Brainfuck machine.
     * */
    public Tape() {
        pointer = 0;
        tape.add(NEW_CELL);
    }

    /**
     * Moves the inner pointer to the next cell (to the right).
     * */
    public void next() {
        if (++pointer > tape.size() - 1) {
            tape.add(NEW_CELL);
        }
    }

    /**
     * Moves the inner pointer to the previous cell (to the left).
     * */
    public void previous() {
        if (pointer <= 0) {
            pointer = 0;
            tape.add(0, NEW_CELL);
        } else {
            --pointer;
        }
    }

    /**
     * Increases the value in the current cell by 1.
     * */
    public void increase() {
        tape.set(pointer, (byte)(tape.get(pointer) + 1));
    }

    /**
     * Decreases the value in the current cell by 1.
     * */
    public void decrease() {
        tape.set(pointer, (byte)(tape.get(pointer) - 1));
    }

    /**
     * Prints the value from the current cell to the {@code System.out}.
     * */
    public void out() {
        System.out.print(Character.valueOf((char)Byte.toUnsignedInt(tape.get(pointer))));
    }

    /**
     * Reads one {@code byte} from the {@code System.in} and stores it in the current cell.
     * */
    public void in() throws IOException {
        tape.set(pointer, (byte)System.in.read());
        System.in.skip(System.in.available());
    }

    /**
     * Checks if the current cell is not empty (is not equals to 0).
     *
     * @return {@code true} if the current cell is not empty (is not equals to 0),
     * {@code false} otherwise.
     * */
    public boolean isNotZero() {
        return tape.get(pointer) != 0;
    }
}
