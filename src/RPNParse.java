import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RPNParse {
    public static void main(String[] args) throws Exception {
        List<String> expressions;
        try (Stream<String> lines = Files.lines(Paths.get("test.data"))) {
            expressions = lines.collect(Collectors.toList());
        }

        for (String s : expressions) {
            RPNCalculatorLexer lexer = new RPNCalculatorLexer(CharStreams.fromString(s));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RPNCalculatorParser parser = new RPNCalculatorParser(tokens);
            ParseTree tree = parser.input();

            RPNBaseVisitor baseVisitor = new RPNBaseVisitor();
            Double result = baseVisitor.visit(tree);

            System.out.println("Expression: " + s + "\nResult: " + result + "\n");
        }
    }
}