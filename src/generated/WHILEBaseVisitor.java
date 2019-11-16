// Generated from C:/Users/jwj/IdeaProjects/hw1/src\WHILE.g4 by ANTLR 4.7.2
 
package generated;
import main.Interpreter;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link WHILEVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class WHILEBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements WHILEVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProgram(WHILEParser.ProgramContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAexpr(WHILEParser.AexprContext ctx) { return visitChildren(ctx); }
}