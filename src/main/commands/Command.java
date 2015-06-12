package main.commands;

import main.Tape;

/**
 * Declares an interface for the Brainfuck commands representation.
 * */
public interface Command {

    /**
     * A Brainfuck <b>' &gt; '</b> command symbol.
     * */
    char NEXT = '>';

    /**
     * A Brainfuck <b>' &lt; '</b> command symbol.
     * */
    char PREVIOUS = '<';

    /**
     * A Brainfuck <b>' + '</b> command symbol.
     * */
    char INCREASE = '+';

    /**
     * A Brainfuck <b>' - '</b> command symbol.
     * */
    char DECREASE = '-';

    /**
     * A Brainfuck <b>' &#046; '</b> command symbol.
     * */
    char OUT = '.';

    /**
     * A Brainfuck <b>' , '</b> command symbol.
     * */
    char IN = ',';

    /**
     * A Brainfuck <b>' [ '</b> command symbol.
     * */
    char LEFT_BRACKET = '[';

    /**
     * A Brainfuck <b>' ] '</b> command symbol.
     * */
    char RIGHT_BRACKET = ']';

    /**
     * Interprets this Brainfuck {@code Command} at the specified context (a {@link Tape}).
     *
     * @param tape a context at which this command must be interpreted.
     * */
    void interpret(Tape tape) throws Exception;
}
