import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RPNParse {
    public static void main(String[] args) throws Exception {

        if(getVersion() != 11) {
            throw new Exception("Compilation only successful with Java 11");
        }

        List<String> expressions;
        try (Stream<String> lines = Files.lines(Paths.get("test.data"))) {
            expressions = lines.collect(Collectors.toList());
        }

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

    // Get version for exception throwing
    private static int getVersion() {
        String version = System.getProperty("java.version");
        if(version.startsWith("1.")) {
            version = version.substring(2, 3);
        } else {
            int dot = version.indexOf(".");
            if(dot != -1) { version = version.substring(0, dot); }
        } return Integer.parseInt(version);
    }
}