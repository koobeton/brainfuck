package main.commands;

public class CommandFactory {

    private static Command next;
    private static Command previous;
    private static Command increase;
    private static Command decrease;
    private static Command out;
    private static Command in;

    public static Command getNext() {
        if (next == null) next = new NextCommand();
        return next;
    }

    public static Command getPrevious() {
        if (previous == null) previous = new PreviousCommand();
        return previous;
    }

    public static Command getIncrease() {
        if (increase == null) increase = new IncreaseCommand();
        return increase;
    }

    public static Command getDecrease() {
        if (decrease == null) decrease = new DecreaseCommand();
        return decrease;
    }

    public static Command getOut() {
        if (out == null) out = new OutCommand();
        return out;
    }

    public static Command getIn() {
        if (in == null) in = new InCommand();
        return in;
    }

    public static LoopCommand getLoop() {
        return new LoopCommand();
    }
}
