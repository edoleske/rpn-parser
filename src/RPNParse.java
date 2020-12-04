import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RPNParse {
    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println("Must have 1 argument: Path of file to parse");
            System.exit(1);
        }

        List<String> expressions = getExpressions(args[0]);

        for (String s : expressions) {
            // Create parse tree with expression
            RPNCalculatorLexer lexer = new RPNCalculatorLexer(CharStreams.fromString(s));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RPNCalculatorParser parser = new RPNCalculatorParser(tokens);
            ParseTree tree = parser.input();

            // Output results of parsing tree
            RPNBaseVisitor baseVisitor = new RPNBaseVisitor();
            Double result = baseVisitor.visit(tree);

            System.out.println("Expression: " + s + "\nResult: " + result + "\n");
        }
    }

    private static List<String> getExpressions(String path) {
        List<String> expressions = Collections.emptyList();
        // test.data is unit test and will be parsed line by line
        if (path.endsWith(".data")) {
            try (Stream<String> lines = Files.lines(Paths.get(path))) {
                expressions = lines.collect(Collectors.toList());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                String e = Files.readString(Paths.get(path));
                expressions = Arrays.asList(e);
            } catch (IOException e) {
                System.err.println("Error reading file: " + path);
            }
        }
        return expressions;
    }
}