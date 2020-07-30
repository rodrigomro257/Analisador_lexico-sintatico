package codigo;
import static codigo.Tokens.*; // SERÁ CRIADA A CLASSE Tokens DO TIPO Enum PARA SER IMPORTADA.

%%
%class Lexer
%type Tokens

L=[a-zA-Z_]+ // LETRAS.
D=[0-9]+ // DÍGITOS.
S=["("|")"|"["|"]"|"{"|"}"|(')|;]+ // SÍMBOLOS DA LINGUAGEM.
E=[@,#,$,¨] // CARACTERES ESPECIAIS.
Espaco=[" ", ]* // ESPAÇO.
Tab=[\t] // TABULAÇÃO.
Enter=[\n,\r]+ // QUEBRA DE LINHA.
ID={L}({L}|{D}|_)* // IDENTIFICADORES.
ConstInteira=("(-"{D}+")")|{D}+ // CONSTANTE INTEIRA.
ConstReal=({D})*(.)({D})* // CONTANTE REAL.
ConstString=(')({L}|{D}|{E})*(') // CONSTANTE STRING.

Progama={Classe}{ID}
DeclaracaoVar={Tipo}{ID}(;)
ListaMetodo=({Metodo})*
Metodo={Tipo}{ID}("("){ListaParam}(")")("{")(DeclaracaoVar)*{ListaCmd}{Retorno}("}")
ListaParam={Param}|
           {Param}(","{Param})*
Param={Tipo}{ID}
Retorno=(return){Expressao}(;)
//Main=(public static void main)("(")(")")("{")({DeclaracaoVar})*{ListaCmd}("}")
Tipo={TipoPrimitivo}("[")("]")
TipoPrimitivo=(boolean)|
              (int)|
              (String)|
              (float)|
              (void)
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
          {ID}("(")  (")")
          {ConstInteira}|
          {ConstReal}|
          {ConstString}|
          (true)|
          (false)|
          (new){TipoPrimitivo}([)  (])|
          {OpUnario}{D}
Op=[||,&&,<,<=,>,>=,==,!=,/,*,-,+]
OpUnario=[_,!]  
Public=(public)    

%{
    public String lexeme;
%}
%%

// DEFINIÇÃO COMO SERÃO OS COMENTÁRIOS.
//{Espaco} {/*Ignore*/} // DEFINE QUE O ESPAÇO É IGNORADO.
"//".* {/*Ignore*/} // DEFINE O QUE É COMENTÁRIO.

// DEFINIÇÃO DAS SEQUENCIA DE CARACTERES QUE SERÃO LIDAS.
if|else|while|print|println|main|class|public {lexeme=yytext(); return Reservadas;}
{ConstInteira} {lexeme=yytext(); return ConstInteira;}
{S} {lexeme=yytext(); return Simbolo;}
(readInt)("("){ConstInteira}(")")(;) {lexeme=yytext(); return funcao_readInt;}
(readFloat)("("){ConstReal}(")")(;) {lexeme=yytext(); return funcao_readFloat;}
(readLine)("("){ConstString}(")")(;) {lexeme=yytext(); return funcao_readLine;}
(readBoolean)("(")(1|0)(")")(;) {lexeme=yytext(); return funcao_readBoolean;}
{Op} {lexeme=yytext(); return Op;}
{OpUnario} {lexeme=yytext(); return OpUnario;}
{TipoPrimitivo} {lexeme=yytext(); return TipoPrimitivo;}
{Tipo} {lexeme=yytext(); return Tipo;}
{Tipo}{ID} {lexeme=yytext(); return Param;}
{ListaParam} {lexeme=yytext(); return ListaParam;}
{Tipo}{ID}(;) {lexeme=yytext(); return DeclaracaoVar;}
{Retorno} {lexeme=yytext(); return Retorno;}
{L}({L}|{D}|_)* {lexeme=yytext(); return ID;}
{Enter} {lexeme=yytext(); return Enter;}
{Tab} {lexeme=yytext(); return Tab;}
{Espaco} {lexeme=yytext(); return E;}

 . {return ERROR;} // ESPAÇO PONTO ESPAÇO É UM ERRO EM PONTO FLUTUANTE.
