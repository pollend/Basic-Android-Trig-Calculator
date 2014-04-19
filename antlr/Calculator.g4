grammar Calculator;		

MUL:'*'|'X'|'x';
ADD:'+';
DIV:'/';
MIN:'-';

LPAR: '(';
RPAR: ')';

POWER: '^';

prog:	(expr)* ;
expr:	expr op=(MUL|DIV) expr # MulDiv
    |	expr op=(ADD|MIN) expr  # AddSub
    |   expr POWER expr # Power
    |	DOUBLE # DOUBLE
    |  LPAR expr RPAR   # parens
    ;

NEWLINE : [\r\n]+ ;
DOUBLE  : [0-9,.]+ ;

