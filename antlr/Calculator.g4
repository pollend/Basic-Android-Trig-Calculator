grammar Calculator;		

MUL:'*';
ADD:'+';
DIV:'/';
MIN:'-';

LPAR: '(';
RPAR: ')';
POWER: '^';

prog:	(expr)*   ;
expr:   expr op=(MUL|DIV) expr # MulDiv
    |	expr op=(ADD|MIN) expr  # AddSub
    |   expr POWER expr # Power
    |   DOUBLE # DOUBLE
    |   function # func
    |   paren+  # parens;

function: func=NAME '(' ((expr',') | expr)+ ')';
paren: LPAR expr RPAR  ;

WS : (' ' | '\t')+{skip();};
DOUBLE  : [0-9] '.' [0-9]+ | [0-9]+ ;
CHEMICAL : [A-Z | a-z]+ [0-9]+;
NAME:[A-Za-z]+;