package main;

import main.commands.Command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Interpreter {

    private String source;
    private Tape tape;
    private List<Command> expression;

    public Interpreter(String source) {
        this.source = source;
        tape = new Tape();
    }

    public static void main(String... args) throws Exception {

        Interpreter interpreter = new Interpreter(handleArgs(args));


    }

    private static String handleArgs(String... args) throws IOException {

        switch (args.length) {
            case 0:
                showUsage();
                System.exit(0);
            case 2:
                if (args[0].equals("-f")) {
                    return readFile(args[1]);
                }
            default:
                return args[0];
        }
    }

    private static String readFile(String file) throws IOException {

        StringBuilder sb = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while((input = reader.readLine()) != null) {
                sb.append(input);
            }
        }
        return sb.toString();
    }

    private static void showUsage() {
        System.out.println("Usage: java -jar brainfuck.jar {\"sourcecode\" | -f filename}");
        System.out.println("\t\"sourcecode\"\t- source text in brainfuck language");
        System.out.println("\tfilename\t- name of the text file with brainfuck source");
    }
}
