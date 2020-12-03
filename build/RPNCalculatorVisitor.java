// Generated from RPNCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RPNCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RPNCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link RPNCalculatorParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSetVariable(RPNCalculatorParser.ToSetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link RPNCalculatorParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(RPNCalculatorParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link RPNCalculatorParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(RPNCalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link RPNCalculatorParser#addOrSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(RPNCalculatorParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link RPNCalculatorParser#addOrSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(RPNCalculatorParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMulOrDiv}
	 * labeled alternative in {@link RPNCalculatorParser#addOrSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMulOrDiv(RPNCalculatorParser.ToMulOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link RPNCalculatorParser#mulOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(RPNCalculatorParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link RPNCalculatorParser#mulOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(RPNCalculatorParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToPow}
	 * labeled alternative in {@link RPNCalculatorParser#mulOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToPow(RPNCalculatorParser.ToPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link RPNCalculatorParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(RPNCalculatorParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToNegate}
	 * labeled alternative in {@link RPNCalculatorParser#trig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToNegate(RPNCalculatorParser.ToNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link RPNCalculatorParser#trig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSine(RPNCalculatorParser.SineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link RPNCalculatorParser#trig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTangent(RPNCalculatorParser.TangentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link RPNCalculatorParser#trig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosine(RPNCalculatorParser.CosineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link RPNCalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(RPNCalculatorParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link RPNCalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(RPNCalculatorParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link RPNCalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(RPNCalculatorParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link RPNCalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(RPNCalculatorParser.ParenthesisContext ctx);
}