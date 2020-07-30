/* The following code was generated by JFlex 1.4.3 on 03/06/20 23:02 */

package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 03/06/20 23:02 from the specification file
 * <tt>C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  5, 11,  0,  0,  5,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     5,  3,  3, 40, 40,  3,  3, 12,  8, 10,  3,  3,  6,  9,  0, 41, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 27,  3, 39,  3,  0, 
     4,  1,  1,  1,  1,  1, 32,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 21, 43,  1,  1,  1,  1,  1,  1, 25,  0, 26,  0,  7, 
     0, 17, 13, 35, 29, 16, 24, 23, 33, 19,  1,  1, 15, 28, 18, 14, 
    38,  1, 22, 36, 20, 34, 42, 37,  1,  1,  1, 30,  3, 31,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  4,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\2\2\1\3\1\4\1\1\1\5\1\6\1\7"+
    "\1\1\10\2\1\10\1\11\1\12\1\2\1\13\1\14"+
    "\5\2\1\15\1\4\2\2\1\16\2\0\1\17\4\16"+
    "\1\20\12\16\1\21\2\16\1\0\2\16\1\22\1\23"+
    "\14\16\1\24\1\16\1\25\2\16\1\26\6\16\1\27"+
    "\1\30\3\16\1\31\1\32\1\16\1\33\1\34\2\16"+
    "\1\35\1\36\1\16\1\37\1\34";

  private static int [] zzUnpackAction() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\54\0\260\0\130\0\334"+
    "\0\54\0\u0108\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210"+
    "\0\u023c\0\u0268\0\54\0\54\0\54\0\u0294\0\54\0\54"+
    "\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\54\0\u039c\0\u03c8"+
    "\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528"+
    "\0\u0554\0\u0420\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c"+
    "\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738\0\u0764\0\u0790\0\u07bc"+
    "\0\u07e8\0\u0814\0\u0420\0\u0420\0\u0840\0\u086c\0\u0898\0\u08c4"+
    "\0\u08f0\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24"+
    "\0\u04a4\0\u0a50\0\u0420\0\u0a7c\0\u0aa8\0\u0420\0\u0ad4\0\u0b00"+
    "\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0\0\u0420\0\u0420\0\u0bdc\0\u0c08"+
    "\0\u0c34\0\u0420\0\u0420\0\u0c60\0\u0420\0\u0c8c\0\u0cb8\0\u0ce4"+
    "\0\u0420\0\u0420\0\u0d10\0\u0420\0\u0420";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\2\6\1\7\1\10"+
    "\1\2\1\11\1\12\1\13\1\14\2\3\1\15\1\3"+
    "\1\16\1\17\1\3\1\20\1\21\1\3\1\22\1\23"+
    "\1\24\1\25\1\26\1\3\1\27\1\30\1\31\2\3"+
    "\1\32\1\33\1\34\1\35\1\36\1\5\1\37\1\40"+
    "\1\41\2\0\1\2\52\0\1\42\1\3\4\0\1\42"+
    "\5\0\14\42\3\0\2\42\2\0\7\42\3\0\2\42"+
    "\2\2\1\4\10\2\1\0\40\2\2\0\1\2\2\0"+
    "\2\12\4\0\1\12\42\0\1\2\6\0\1\43\47\0"+
    "\2\12\4\0\1\12\41\0\1\44\1\13\1\0\1\44"+
    "\1\0\2\44\4\0\1\45\14\44\3\0\2\44\2\0"+
    "\7\44\1\0\1\44\1\0\2\44\1\0\1\42\1\3"+
    "\4\0\1\42\5\0\1\42\1\46\12\42\3\0\2\42"+
    "\2\0\7\42\3\0\2\42\1\0\1\42\1\3\4\0"+
    "\1\42\5\0\2\42\1\47\11\42\3\0\2\42\2\0"+
    "\7\42\3\0\2\42\1\0\1\42\1\3\4\0\1\42"+
    "\5\0\3\42\1\50\10\42\3\0\2\42\2\0\7\42"+
    "\3\0\2\42\1\0\1\42\1\3\4\0\1\42\5\0"+
    "\5\42\1\51\5\42\1\52\3\0\2\42\2\0\7\42"+
    "\3\0\2\42\1\0\1\42\1\3\4\0\1\42\5\0"+
    "\7\42\1\53\4\42\3\0\2\42\2\0\7\42\3\0"+
    "\2\42\1\0\1\42\1\3\4\0\1\42\5\0\3\42"+
    "\1\54\10\42\3\0\2\42\2\0\7\42\3\0\2\42"+
    "\1\0\1\42\1\3\4\0\1\42\5\0\2\42\1\55"+
    "\11\42\3\0\2\42\2\0\7\42\3\0\2\42\1\0"+
    "\1\42\1\3\4\0\1\42\5\0\4\42\1\56\7\42"+
    "\3\0\2\42\2\0\7\42\3\0\2\42\1\0\1\42"+
    "\1\3\4\0\1\42\5\0\4\42\1\57\7\42\3\0"+
    "\2\42\2\0\7\42\3\0\2\42\1\0\1\42\1\3"+
    "\4\0\1\42\5\0\2\42\1\60\11\42\3\0\2\42"+
    "\2\0\7\42\3\0\2\42\1\0\1\42\1\3\4\0"+
    "\1\42\5\0\7\42\1\61\4\42\3\0\2\42\2\0"+
    "\7\42\3\0\2\42\1\0\1\42\1\3\4\0\1\42"+
    "\5\0\14\42\3\0\2\42\2\0\1\42\1\62\5\42"+
    "\3\0\2\42\1\0\1\42\1\3\4\0\1\42\5\0"+
    "\11\42\1\63\2\42\3\0\2\42\2\0\2\42\1\64"+
    "\4\42\3\0\2\42\2\0\1\2\46\0\1\65\3\0"+
    "\1\42\1\3\4\0\1\42\5\0\1\42\1\66\12\42"+
    "\3\0\2\42\2\0\7\42\3\0\2\42\1\0\1\42"+
    "\1\3\4\0\1\42\5\0\11\42\1\67\2\42\3\0"+
    "\2\42\2\0\7\42\3\0\2\42\1\0\2\42\4\0"+
    "\1\42\5\0\14\42\3\0\2\42\2\0\7\42\3\0"+
    "\2\42\2\0\1\70\52\0\2\44\1\0\1\44\1\0"+
    "\2\44\4\0\1\45\14\44\3\0\2\44\2\0\7\44"+
    "\1\0\1\44\1\0\2\44\55\0\2\42\4\0\1\42"+
    "\5\0\1\42\1\71\12\42\3\0\2\42\2\0\7\42"+
    "\3\0\2\42\1\0\2\42\4\0\1\42\5\0\14\42"+
    "\3\0\2\42\2\0\4\42\1\72\2\42\3\0\2\42"+
    "\1\0\2\42\4\0\1\42\5\0\14\42\3\0\2\42"+
    "\2\0\5\42\1\73\1\42\3\0\2\42\1\0\2\42"+
    "\4\0\1\42\5\0\7\42\1\74\4\42\3\0\2\42"+
    "\2\0\7\42\3\0\2\42\1\0\2\42\4\0\1\42"+
    "\5\0\11\42\1\75\2\42\3\0\2\42\2\0\7\42"+
    "\3\0\2\42\1\0\2\42\4\0\1\42\5\0\7\42"+
    "\1\76\4\42\3\0\2\42\2\0\7\42\3\0\2\42"+
    "\1\0\2\42\4\0\1\42\5\0\1\42\1\77\12\42"+
    "\3\0\2\42\2\0\7\42\3\0\2\42\1\0\2\42"+
    "\4\0\1\42\5\0\6\42\1\100\5\42\3\0\2\42"+
    "\2\0\7\42\3\0\2\42\1\0\2\42\4\0\1\42"+
    "\5\0\2\42\1\101\11\42\3\0\2\42\2\0\7\42"+
    "\3\0\2\42\1\0\2\42\4\0\1\42\5\0\4\42"+
    "\1\102\7\42\3\0\2\42\2\0\7\42\3\0\2\42"+
    "\1\0\2\42\4\0\1\42\5\0\4\42\1\103\7\42"+
    "\3\0\2\42\2\0\7\42\3\0\2\42\1\0\2\42"+
    "\4\0\1\42\5\0\6\42\1\104\5\42\3\0\2\42"+
    "\2\0\7\42\3\0\2\42\1\0\2\42\4\0\1\42"+
    "\5\0\6\42\1\105\5\42\3\0\2\42\2\0\7\42"+
    "\3\0\2\42\1\0\2\42\4\0\1\42\5\0\1\106"+
    "\13\42\3\0\2\42\2\0\7\42\3\0\2\42\13\65"+
    "\1\0\40\65\1\0\2\42\4\0\1\42\5\0\6\42"+
    "\1\107\5\42\3\0\2\42\2\0\7\42\3\0\2\42"+
    "\1\0\2\42\4\0\1\42\5\0\14\42\3\0\2\42"+
    "\2\0\2\42\1\110\4\42\3\0\2\42\2\0\1\70"+
    "\7\0\1\111\42\0\2\42\4\0\1\42\5\0\2\42"+
    "\1\112\11\42\3\0\2\42\2\0\7\42\3\0\2\42"+
    "\1\0\2\42\4\0\1\42\5\0\3\42\1\113\10\42"+
    "\3\0\2\42\2\0\7\42\3\0\2\42\1\0\2\42"+
    "\4\0\1\42\5\0\6\42\1\114\5\42\3\0\2\42"+
    "\2\0\7\42\3\0\2\42\1\0\2\42\4\0\1\42"+
    "\5\0\14\42\3\0\2\42\2\0\2\42\1\115\4\42"+
    "\3\0\2\42\1\0\2\42\4\0\1\42\5\0\4\42"+
    "\1\51\7\42\3\0\2\42\2\0\7\42\3\0\2\42"+
    "\1\0\2\42\4\0\1\42\5\0\5\42\1\116\6\42"+
    "\3\0\2\42\2\0\7\42\3\0\2\42\1\0\2\42"+
    "\4\0\1\42\5\0\14\42\3\0\2\42\2\0\4\42"+
    "\1\117\2\42\3\0\2\42\1\0\2\42\4\0\1\42"+
    "\5\0\14\42\3\0\2\42\2\0\4\42\1\120\2\42"+
    "\3\0\2\42\1\0\2\42\4\0\1\42\5\0\7\42"+
    "\1\121\4\42\3\0\2\42\2\0\7\42\3\0\2\42"+
    "\1\0\2\42\4\0\1\42\5\0\2\42\1\122\11\42"+
    "\3\0\2\42\2\0\7\42\3\0\2\42\1\0\2\42"+
    "\4\0\1\42\5\0\5\42\1\123\6\42\3\0\2\42"+
    "\2\0\7\42\3\0\2\42\1\0\2\42\4\0\1\42"+
    "\5\0\2\42\1\124\11\42\3\0\2\42\2\0\7\42"+
    "\3\0\2\42\1\0\2\42\4\0\1\42\5\0\14\42"+
    "\3\0\1\42\1\125\2\0\7\42\3\0\2\42\1\0"+
    "\2\42\4\0\1\42\5\0\3\42\1\126\10\42\3\0"+
    "\2\42\2\0\7\42\3\0\2\42\1\0\2\42\4\0"+
    "\1\42\5\0\3\42\1\127\10\42\3\0\2\42\2\0"+
    "\7\42\3\0\2\42\1\0\2\42\4\0\1\42\5\0"+
    "\5\42\1\130\6\42\3\0\2\42\2\0\7\42\3\0"+
    "\2\42\1\0\2\42\4\0\1\42\5\0\11\42\1\131"+
    "\2\42\3\0\2\42\2\0\7\42\3\0\2\42\1\0"+
    "\2\42\4\0\1\42\5\0\3\42\1\132\10\42\3\0"+
    "\2\42\2\0\7\42\3\0\2\42\1\0\2\42\4\0"+
    "\1\42\5\0\14\42\3\0\2\42\2\0\4\42\1\133"+
    "\2\42\3\0\2\42\1\0\2\42\4\0\1\42\5\0"+
    "\6\42\1\134\5\42\3\0\2\42\2\0\7\42\3\0"+
    "\2\42\1\0\2\42\4\0\1\42\5\0\3\42\1\135"+
    "\10\42\3\0\2\42\2\0\7\42\3\0\2\42\1\0"+
    "\2\42\4\0\1\42\5\0\7\42\1\136\4\42\3\0"+
    "\2\42\2\0\7\42\3\0\2\42\1\0\2\42\4\0"+
    "\1\42\5\0\6\42\1\137\5\42\3\0\2\42\2\0"+
    "\7\42\3\0\2\42\1\0\2\42\4\0\1\42\5\0"+
    "\4\42\1\140\7\42\3\0\2\42\2\0\7\42\3\0"+
    "\2\42\1\0\2\42\4\0\1\42\5\0\12\42\1\74"+
    "\1\42\3\0\2\42\2\0\7\42\3\0\2\42\1\0"+
    "\2\42\4\0\1\42\5\0\5\42\1\141\6\42\3\0"+
    "\2\42\2\0\7\42\3\0\2\42\1\0\2\42\4\0"+
    "\1\42\5\0\14\42\3\0\2\42\2\0\3\42\1\142"+
    "\3\42\3\0\2\42\1\0\2\42\4\0\1\42\5\0"+
    "\2\42\1\143\11\42\3\0\2\42\2\0\7\42\3\0"+
    "\2\42\1\0\2\42\4\0\1\42\5\0\14\42\3\0"+
    "\2\42\2\0\3\42\1\144\3\42\3\0\2\42\1\0"+
    "\2\42\4\0\1\42\5\0\5\42\1\74\6\42\3\0"+
    "\2\42\2\0\7\42\3\0\2\42\1\0\2\42\4\0"+
    "\1\42\5\0\5\42\1\145\6\42\3\0\2\42\2\0"+
    "\7\42\3\0\2\42";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3388];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\42\1\2\0\1\11\22\1\1\0\20\1\1\11\34\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 6: 
          { return new Symbol(sym.AbreParentese, yychar, yyline, yytext());
          }
        case 32: break;
        case 11: 
          { return new Symbol(sym.AbreChave, yychar, yyline, yytext());
          }
        case 33: break;
        case 16: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 34: break;
        case 9: 
          { return new Symbol(sym.FechaCochete, yychar, yyline, yytext());
          }
        case 35: break;
        case 10: 
          { return new Symbol(sym.PontoVirgula, yychar, yyline, yytext());
          }
        case 36: break;
        case 27: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 37: break;
        case 14: 
          { return new Symbol(sym.ID, yychar, yyline, yytext());
          }
        case 38: break;
        case 22: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 39: break;
        case 20: 
          { return new Symbol(sym.ConstInteira, yychar, yyline, yytext());
          }
        case 40: break;
        case 3: 
          { return new Symbol(sym.Digito, yychar, yyline, yytext());
          }
        case 41: break;
        case 4: 
          { return new Symbol(sym.Op, yychar, yyline, yytext());
          }
        case 42: break;
        case 2: 
          { return new Symbol(sym.ConstReal, yychar, yyline, yytext());
          }
        case 43: break;
        case 30: 
          { return new Symbol(sym.Static, yychar, yyline, yytext());
          }
        case 44: break;
        case 18: 
          { return new Symbol(sym.New, yychar, yyline, yytext());
          }
        case 45: break;
        case 7: 
          { return new Symbol(sym.FechaParentese, yychar, yyline, yytext());
          }
        case 46: break;
        case 26: 
          { return new Symbol(sym.Class, yychar, yyline, yytext());
          }
        case 47: break;
        case 23: 
          { return new Symbol(sym.Void, yychar, yyline, yytext());
          }
        case 48: break;
        case 15: 
          { return new Symbol(sym.ConstString, yychar, yyline, yytext());
          }
        case 49: break;
        case 29: 
          { return new Symbol(sym.Retorno, yychar, yyline, yytext());
          }
        case 50: break;
        case 28: 
          { return new Symbol(sym.Print, yychar, yyline, yytext());
          }
        case 51: break;
        case 21: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 52: break;
        case 31: 
          { return new Symbol(sym.Public, yychar, yyline, yytext());
          }
        case 53: break;
        case 13: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 54: break;
        case 5: 
          { return new Symbol(sym.OpUnario, yychar, yyline, yytext());
          }
        case 55: break;
        case 12: 
          { return new Symbol(sym.FechaChave, yychar, yyline, yytext());
          }
        case 56: break;
        case 24: 
          { return new Symbol(sym.True, yychar, yyline, yytext());
          }
        case 57: break;
        case 8: 
          { return new Symbol(sym.AbreCochete, yychar, yyline, yytext());
          }
        case 58: break;
        case 25: 
          { return new Symbol(sym.False, yychar, yyline, yytext());
          }
        case 59: break;
        case 17: 
          { /*Ignore*/
          }
        case 60: break;
        case 1: 
          { return new Symbol(sym.E, yychar, yyline, yytext());
          }
        case 61: break;
        case 19: 
          { return new Symbol(sym.TipoPrimitivo, yychar, yyline, yytext());
          }
        case 62: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}