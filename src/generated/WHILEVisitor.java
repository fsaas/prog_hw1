// Generated from C:/Users/jwj/IdeaProjects/hw1/src\WHILE.g4 by ANTLR 4.7.2
 
package generated;
import main.Interpreter;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WHILEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WHILEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(WHILEParser.AexprContext ctx);
}