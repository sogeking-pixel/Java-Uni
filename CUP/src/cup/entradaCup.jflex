package cup;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | entero | caracter | longuitud | flotante | double ) {return new Symbol(sym.T_Dato, yychar, yyline, yytext());}

/* Tipos de datosMain */
( void ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Tipo de dato String */
( Cadena ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada graficarCuadrado */
( GCuadrado ) {return new Symbol(sym.graficarCuadrado, yychar, yyline, yytext());}

/* Palabra reservada graficarTriangulo */
( GTriangulo ) {return new Symbol(sym.graficarTriangulo, yychar, yyline, yytext());}

/* Palabra reservada graficarCirculo */
( GCirculo ) {return new Symbol(sym.graficarCirculo, yychar, yyline, yytext());}

/* Palabra reservada graficarPoligono */
( GPoligono ) {return new Symbol(sym.graficarPoligono, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Palabra reservada If */
( Si ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( No ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( Hacer ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( Mientras ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( Para ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "==" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "<-" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( verdadero | falso ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "Principal" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
"-"{D}+|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}