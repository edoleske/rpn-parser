import java.util.HashMap;

public class RPNBaseVisitor extends RPNCalculatorBaseVisitor<Double> {
    private HashMap<String,Double> variables = new HashMap<String,Double>();

    @Override
    public Double visitAssignment(RPNCalculatorParser.AssignmentContext ctx) {
        Double value = visit(ctx.addOrSub());
        variables.put(ctx.ID().getText(), value);
        return value;
    }

    @Override
    public Double visitVariable(RPNCalculatorParser.VariableContext ctx) {
        return variables.get(ctx.ID().getText());
    }

    @Override
    public Double visitInt(RPNCalculatorParser.IntContext ctx) {
        return Double.parseDouble(ctx.INT().getText());
    }

    @Override
    public Double visitDouble(RPNCalculatorParser.DoubleContext ctx) {
        return Double.parseDouble(ctx.DOUBLE().getText());
    }

    @Override
    public Double visitAddition(RPNCalculatorParser.AdditionContext ctx) {
        Double result = visit(ctx.addOrSub());
        for (RPNCalculatorParser.MulOrDivContext c : ctx.mulOrDiv()) {
            result += visit(c);
        }
        return result;
    }

    @Override
    public Double visitSubtraction(RPNCalculatorParser.SubtractionContext ctx) {
        Double result = visit(ctx.addOrSub());
        for (RPNCalculatorParser.MulOrDivContext c : ctx.mulOrDiv()) {
            result -= visit(c);
        }
        return result;
    }

    @Override
    public Double visitMultiplication(RPNCalculatorParser.MultiplicationContext ctx) {
        Double result = visit(ctx.mulOrDiv());
        for (RPNCalculatorParser.PowContext c : ctx.pow()) {
            result *= visit(c);
        }
        return result;
    }

    @Override
    public Double visitDivision(RPNCalculatorParser.DivisionContext ctx) {
        return visit(ctx.mulOrDiv()) / visit(ctx.pow());
    }

    @Override
    public Double visitPower(RPNCalculatorParser.PowerContext ctx) {
        if (ctx.pow() != null) {
            return Math.pow(visit(ctx.trig()), visit(ctx.pow()));
        }
        return visit(ctx.trig());
    }

    @Override
    public Double visitSine(RPNCalculatorParser.SineContext ctx) { return Math.sin(visit(ctx.trig())); }

    @Override
    public Double visitCosine(RPNCalculatorParser.CosineContext ctx) { return Math.cos(visit(ctx.trig())); }

    @Override
    public Double visitTangent(RPNCalculatorParser.TangentContext ctx) { return Math.tan(visit(ctx.trig())); }

    @Override
    public Double visitParenthesis(RPNCalculatorParser.ParenthesisContext ctx) {
        return visit(ctx.addOrSub());
    }

    @Override
    public Double visitCalculate(RPNCalculatorParser.CalculateContext ctx) {
        return visit(ctx.addOrSub());
    }
}