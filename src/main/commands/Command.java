package main.commands;

import main.Tape;

public interface Command {

    char NEXT = '>';
    char PREVIOUS = '<';
    char INCREASE = '+';
    char DECREASE = '-';
    char OUT = '.';
    char IN = ',';
    char LEFT_BRACKET = '[';
    char RIGHT_BRACKET = ']';

    void interpret(Tape tape) throws Exception;
}
