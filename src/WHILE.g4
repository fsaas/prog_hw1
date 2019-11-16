grammar WHILE;

@header { 
package generated;
import main.Interpreter;
}

program returns [int ss]
    : exp = aexpr {System.out.println($exp.sv);};

aexpr returns [int sv]
	: N		{
	    String n = $N.getText();
	    $sv =  Integer.parseInt(n);
	}
	| IDENT	{
	    String id =$IDENT.getText();
	    Interpreter.state.get(id);
	    }
	| a1=aexpr '+' a2=aexpr	{
		int i1 = $a1.sv;
		int i2 = $a2.sv;
		$sv = i1 + i2;
	}
	| a1=aexpr '*' a2=aexpr	{
		$sv = $a1.sv * $a2.sv;
	}
	| a1=aexpr '-' a2=aexpr	{
		$sv = $a1.sv - $a2.sv;
	}
	;

N :   [0-9]+
	;

IDENT : [a-zA-Z]	
		;

WS  :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
	-> channel(HIDDEN)	 
    ;
