package main;

public class Parser {

    public static Expression parse(String source) {

        Expression result = new Expression();

        source = source.replaceAll("[^><+-.,\\[\\]]", "");



        return result;
    }
}
