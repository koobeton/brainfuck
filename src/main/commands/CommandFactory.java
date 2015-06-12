package main.commands;

/**
 * A factory that produces a Brainfuck commands instances.
 *
 * @see NextCommand
 * @see PreviousCommand
 * @see IncreaseCommand
 * @see DecreaseCommand
 * @see OutCommand
 * @see InCommand
 * @see LoopCommand
 * @see Command
 * */
public class CommandFactory {

    private static Command next;
    private static Command previous;
    private static Command increase;
    private static Command decrease;
    private static Command out;
    private static Command in;

    /**
     * Produces a {@code NextCommand} instance.
     *
     * @return a singleton instance.
     *
     * @see NextCommand
     * @see Command
     * */
    public static Command getNext() {
        if (next == null) next = new NextCommand();
        return next;
    }

    /**
     * Produces a {@code PreviousCommand} instance.
     *
     * @return a singleton instance.
     *
     * @see PreviousCommand
     * @see Command
     * */
    public static Command getPrevious() {
        if (previous == null) previous = new PreviousCommand();
        return previous;
    }

    /**
     * Produces an {@code IncreaseCommand} instance.
     *
     * @return a singleton instance.
     *
     * @see IncreaseCommand
     * @see Command
     * */
    public static Command getIncrease() {
        if (increase == null) increase = new IncreaseCommand();
        return increase;
    }

    /**
     * Produces a {@code DecreaseCommand} instance.
     *
     * @return a singleton instance.
     *
     * @see DecreaseCommand
     * @see Command
     * */
    public static Command getDecrease() {
        if (decrease == null) decrease = new DecreaseCommand();
        return decrease;
    }

    /**
     * Produces an {@code OutCommand} instance.
     *
     * @return a singleton instance.
     *
     * @see OutCommand
     * @see Command
     * */
    public static Command getOut() {
        if (out == null) out = new OutCommand();
        return out;
    }

    /**
     * Produces an {@code InCommand} instance.
     *
     * @return a singleton instance.
     *
     * @see InCommand
     * @see Command
     * */
    public static Command getIn() {
        if (in == null) in = new InCommand();
        return in;
    }

    /**
     * Produces a {@code LoopCommand} instance.
     *
     * @return a new instance.
     *
     * @see LoopCommand
     * @see Command
     * */
    public static LoopCommand getLoop() {
        return new LoopCommand();
    }
}
