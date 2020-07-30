package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L=[a-zA-Z_]+ // LETRAS.
D=[0-9]+ // DÍGITOS.
S=["("|")"|"["|"]"|"{"|"}"|(')|;]+ // SÍMBOLOS DA LINGUAGEM.
E=[@,#,$,¨] // CARACTERES ESPECIAIS.
Enter=[\n,\r]+ // QUEBRA DE LINHA.
Espaco=[" ", ,\t,\n,\r]* // ESPAÇO.
ID={L}({L}|{D}|_)* // IDENTIFICADORES.
ConstInteira=("(-"{D}+")")|{D}+ // CONSTANTE INTEIRA.
ConstReal=({D})*(.)({D})* // CONTANTE REAL.
ConstString=(')({L}|{D}|{E})*(') // CONSTANTE STRING.

TipoPrimitivo=(boolean)|
              (int)|
              (String)|
              (float)
Tipo={TipoPrimitivo}("[")("]")
DeclaracaoVar={TipoPrimitivo}([)(])(;) | {Tipo}([)(])(;)

ListaCmd=(Cmd)*
Cmd=("{"){ListaCmd}("}")|
    CmdIF|
    CmdWhile|
    CmdAtrib|
    CmdFunc|
    CmdPrint|
    CmdPrintln
CmdIF=(if)("("){Expressao}(")"){Cmd}|
      (if)("("){Expressao}(")"){Cmd}(else){Cmd}
CmdWhile=(while)("("){Expressao}(")")
CmdPrint=(print)("("){Expressao}(")")(;)
CmdPrintln=(println)("("){Expressao}(")")(;)
CmdAtrib={ID}(=){Expressao}(;)|
         {ID}("["){Expressao}("]")(=){Expressao}(;)
CmdFunc={ID}({Expressao}(","{Expressao})*)
Expressao={D}{Op}{D}|
          {ID}([)(])| // CONSERTAR.
          {ID}|
          {ID}("(") (")")|
          {ConstInteira}|
          {ConstReal}|
          {ConstString}|
          (true)|
          (false)|
          (new){TipoPrimitivo}([)(])|
          {OpUnario}{D}
Op=[||, &&, <, >, +, -, *, /]
OpUnario=[_,!]
Public=(public)


%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

{Espaco} {return new Symbol(sym.E, yychar, yyline, yytext());}
"//".* {/*Ignore*/} // DEFINE O QUE É COMENTÁRIO.
{Op} {return new Symbol(sym.Op, yychar, yyline, yytext());}
{OpUnario} {return new Symbol(sym.OpUnario, yychar, yyline, yytext());}
{D} {return new Symbol(sym.Digito, yychar, yyline, yytext());}
{TipoPrimitivo} {return new Symbol(sym.TipoPrimitivo, yychar, yyline, yytext());}
(if) {return new Symbol(sym.If, yychar, yyline, yytext());}
(else) {return new Symbol(sym.Else, yychar, yyline, yytext());}
(while) {return new Symbol(sym.While, yychar, yyline, yytext());}
(print) {return new Symbol(sym.Print, yychar, yyline, yytext());}
(println) {return new Symbol(sym.Print, yychar, yyline, yytext());}
(public) {return new Symbol(sym.Public, yychar, yyline, yytext());}
(static) {return new Symbol(sym.Static, yychar, yyline, yytext());}
(void) {return new Symbol(sym.Void, yychar, yyline, yytext());}
(main) {return new Symbol(sym.Main, yychar, yyline, yytext());}
(class) {return new Symbol(sym.Class, yychar, yyline, yytext());}
(return) {return new Symbol(sym.Retorno, yychar, yyline, yytext());}
(new) {return new Symbol(sym.New, yychar, yyline, yytext());}
(True) {return new Symbol(sym.True, yychar, yyline, yytext());}
(False) {return new Symbol(sym.False, yychar, yyline, yytext());}
"=" {return new Symbol(sym.Igual, yychar, yyline, yytext());}
//"+" {return new Symbol(sym.Soma, yychar, yyline, yytext());}
//"-" {return new Symbol(sym.Subtracao, yychar, yyline, yytext());}
//"*" {return new Symbol(sym.Multiplicacao, yychar, yyline, yytext());}
//"/" {return new Symbol(sym.Divisao, yychar, yyline, yytext());}
"(" {return new Symbol(sym.AbreParentese, yychar, yyline, yytext());}
")" {return new Symbol(sym.FechaParentese, yychar, yyline, yytext());}
"[" {return new Symbol(sym.AbreCochete, yychar, yyline, yytext());}
"]" {return new Symbol(sym.FechaCochete, yychar, yyline, yytext());}
"{" {return new Symbol(sym.AbreChave, yychar, yyline, yytext());}
"}" {return new Symbol(sym.FechaChave, yychar, yyline, yytext());}
";" {return new Symbol(sym.PontoVirgula, yychar, yyline, yytext());}
"," {return new Symbol(sym.Virgula, yychar, yyline, yytext());}
{ConstInteira} {return new Symbol(sym.ConstInteira, yychar, yyline, yytext());}
{ConstReal} {return new Symbol(sym.ConstReal, yychar, yyline, yytext());}
{ConstString} {return new Symbol(sym.ConstString, yychar, yyline, yytext());}
{L}({L}|{D}|_)* {return new Symbol(sym.ID, yychar, yyline, yytext());}
. {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
