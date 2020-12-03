grammar RPNCalculator;

SIN   : 'sin';
COS   : 'cos';
TAN   : 'tan';
ADD   : '+';
SUB   : '-';
MUL   : '*';
DIV   : '/';
POW   : '^';
EQUAL : '=';
LPAR  : '(';
RPAR  : ')';

NL     : '\n' | ';';
WS     : [ \t\r]+ -> skip;
ID     : [a-zA-Z_][a-zA-Z_0-9]*;
INT    : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;


input
    : setVariable NL input # ToSetVariable
    | addOrSub NL? EOF     # Calculate
    ;

setVariable
    : ID EQUAL addOrSub # Assignment
    ;

addOrSub
    : addOrSub (mulOrDiv)+ ADD # Addition
    | addOrSub (mulOrDiv)+ SUB # Subtraction
    | mulOrDiv              # ToMulOrDiv
    ;

mulOrDiv
    : mulOrDiv (pow)+ MUL # Multiplication
    | mulOrDiv pow DIV # Division
    | pow              # ToPow
    ;

pow
    : trig (pow POW)? # Power
    ;

trig
    : trig SIN   # Sine
    | trig COS   # Cosine
    | trig TAN   # Tangent
    | atom     # ToNegate
    ;

atom
    : INT                # Int
    | DOUBLE             # Double
    | ID                 # Variable
    | LPAR addOrSub RPAR # Parenthesis
    ;