package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.*;

import java.util.HashMap;
import java.util.Map;

public class Interpreter {
	public static Map<String, Integer> state = new HashMap<>();
	public static void main(String[] args) throws Exception {
		CharStream codeCharStream = CharStreams.fromFileName("test.wh");
		WHILELexer lexer = new WHILELexer( codeCharStream);
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		WHILEParser parser		= new WHILEParser( tokens );
		ParseTree 	tree 		= parser.program();
	  }
}


