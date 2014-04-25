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
    |   paren function # mixedfunctionParen
    |   function paren # mixedfunctionParen
    |   function+ # func
    |   paren+  # parens;

paren: DOUBLE LPAR expr RPAR DOUBLE 
     | DOUBLE LPAR expr RPAR 
     | LPAR expr RPAR DOUBLE 
     | LPAR expr RPAR ;

function: DOUBLE func=NAME LPAR ((expr',')+ expr) RPAR DOUBLE
        | DOUBLE func=NAME LPAR  expr RPAR DOUBLE
        | DOUBLE func=NAME LPAR ((expr',')+ expr) RPAR 
        | DOUBLE func=NAME LPAR  expr RPAR 
        | func=NAME LPAR ((expr',')+ expr) RPAR DOUBLE
        | func=NAME LPAR  expr RPAR DOUBLE
        | func=NAME LPAR ((expr',')+ expr) RPAR
        | func=NAME LPAR expr RPAR;

WS : (' ' | '\t')+{skip();};
DOUBLE  : ([0-9]+ '.' [0-9]+) | [0-9]+ | '.' [0-9]+;
CHEMICAL : [A-Z | a-z]+ [0-9]+;
NAME:[A-Z | a-z]+;