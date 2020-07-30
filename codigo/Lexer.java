/* The following code was generated by JFlex 1.4.3 on 11/12/19 15:59 */

package codigo;
import static codigo.Tokens.*; // SERÁ CRIADA A CLASSE Tokens DO TIPO Enum PARA SER IMPORTADA.


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/12/19 15:59 from the specification file
 * <tt>C:/Users/Windows/Desktop/Engenharia da Computação/8° Período/Compiladores/Trabalho Final/Parte 2 - Análise Sintática/analisador_lexico_sintatico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\7\1\15\2\0\1\10\22\0\1\5\1\51\1\0\2\4"+
    "\1\0\1\51\1\16\1\12\1\14\2\51\1\6\1\13\1\0\1\52"+
    "\1\55\1\55\10\2\1\0\1\17\1\51\1\51\1\51\1\0\1\4"+
    "\1\1\1\54\1\1\1\1\1\1\1\44\2\1\1\43\2\1\1\53"+
    "\3\1\1\1\2\1\1\35\2\1\1\1\1\1\3\1\1\31\1\0"+
    "\1\32\1\0\1\11\1\0\1\23\1\33\1\21\1\41\1\20\1\37"+
    "\1\36\1\45\1\34\2\1\1\22\1\42\1\30\1\25\1\50\1\1"+
    "\1\24\1\46\1\26\1\27\1\40\1\47\3\1\1\3\1\3\1\3"+
    "\52\0\1\4\uff57\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\5\1\1\1\6\1\7"+
    "\1\10\1\11\1\5\13\3\2\6\1\10\1\0\5\3"+
    "\1\12\7\3\1\13\1\0\5\3\1\14\7\3\1\4"+
    "\4\3\1\0\11\3\1\15\1\3\1\12\7\3\1\16"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\1\17\1\0"+
    "\3\3\1\20\2\0\1\3\1\20\1\0\1\3\7\0"+
    "\1\3\1\0\1\3\1\0\1\3\11\0\1\3\1\0"+
    "\5\3\5\0\1\21\4\0\1\3\1\0\5\3\11\0"+
    "\5\3\3\0\1\22\1\23\1\0\2\3\1\0\1\24"+
    "\1\0\2\3\1\25\1\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[176];
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
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\56"+
    "\0\u0142\0\134\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256"+
    "\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\56\0\u0398"+
    "\0\u0114\0\u03c6\0\u03f4\0\u0422\0\u0450\0\u047e\0\u04ac\0\134"+
    "\0\u04da\0\u0508\0\u0536\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c"+
    "\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c"+
    "\0\u07ba\0\u07e8\0\u0816\0\u0844\0\u0872\0\u08a0\0\56\0\u08ce"+
    "\0\u08fc\0\u092a\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e"+
    "\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae"+
    "\0\u0bdc\0\u0c0a\0\u0c38\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e"+
    "\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0e32\0\u0e60\0\u0e8e"+
    "\0\u0ebc\0\u0eea\0\56\0\u0f18\0\u0f46\0\u0f74\0\u0fa2\0\56"+
    "\0\u0fd0\0\u0ffe\0\u102c\0\u0e04\0\u105a\0\u1088\0\u10b6\0\u10e4"+
    "\0\u1112\0\u1140\0\u116e\0\u119c\0\u11ca\0\u11f8\0\u1226\0\u1254"+
    "\0\u1282\0\u12b0\0\u12de\0\u130c\0\u133a\0\u1368\0\u1396\0\u13c4"+
    "\0\u13f2\0\u1420\0\u144e\0\u147c\0\u14aa\0\u14d8\0\u1506\0\u1534"+
    "\0\u1562\0\u1590\0\u15be\0\u15ec\0\u161a\0\u1648\0\u1676\0\56"+
    "\0\u16a4\0\u16d2\0\u1700\0\u172e\0\u175c\0\u178a\0\u17b8\0\u17e6"+
    "\0\u1814\0\u1842\0\u1870\0\u189e\0\u18cc\0\u18fa\0\u1928\0\u1956"+
    "\0\u1984\0\u19b2\0\u19e0\0\u1a0e\0\u1a3c\0\u1a6a\0\u1a98\0\u1ac6"+
    "\0\u1af4\0\u1b22\0\u1b50\0\u1b7e\0\56\0\56\0\u1bac\0\u1bda"+
    "\0\u1c08\0\u1c36\0\u1c64\0\u1c92\0\u1cc0\0\u1cee\0\56\0\u1d1c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[176];
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
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\2\1\5\1\11\2\5\1\14"+
    "\1\15\2\3\1\16\4\3\2\5\1\17\1\20\1\21"+
    "\1\3\1\22\1\23\1\3\1\24\4\3\1\25\1\26"+
    "\1\27\1\30\2\3\1\4\57\0\2\3\6\0\1\3"+
    "\6\0\11\3\2\0\16\3\2\0\3\3\2\0\1\4"+
    "\52\0\1\4\3\0\1\5\6\0\1\5\1\0\1\5"+
    "\1\0\2\5\11\0\2\5\30\0\2\6\54\0\1\6"+
    "\1\31\1\0\1\11\4\0\1\11\46\0\1\11\1\0"+
    "\1\11\4\0\1\11\43\0\1\5\6\0\1\5\1\32"+
    "\1\5\1\0\2\5\11\0\2\5\24\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\33\6\3\2\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\2\3\1\34"+
    "\6\3\2\0\16\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\1\35\10\3\2\0\16\3\2\0\3\3"+
    "\1\0\2\3\6\0\1\3\6\0\5\3\1\36\3\3"+
    "\2\0\16\3\2\0\3\3\1\0\2\3\6\0\1\3"+
    "\6\0\10\3\1\37\2\0\4\3\1\40\11\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\6\3\1\41"+
    "\2\3\2\0\16\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\42\6\3\2\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\5\3\1\43"+
    "\3\3\2\0\16\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\3\3\1\44\5\3\2\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\11\3\2\0"+
    "\12\3\1\45\3\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\4\3\1\46\2\3\1\47\1\3\2\0"+
    "\16\3\2\0\3\3\52\0\1\50\5\0\1\51\52\0"+
    "\1\51\1\0\2\3\6\0\1\3\6\0\11\3\2\0"+
    "\13\3\1\52\2\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\3\3\1\53\5\3\2\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\3\3\1\54"+
    "\2\3\1\55\2\3\2\0\16\3\2\0\3\3\1\0"+
    "\2\3\6\0\1\3\6\0\5\3\1\56\3\3\2\0"+
    "\16\3\2\0\3\3\1\0\2\3\6\0\1\3\6\0"+
    "\6\3\1\57\2\3\2\0\16\3\2\0\3\3\1\0"+
    "\2\3\6\0\1\3\6\0\4\3\1\60\4\3\2\0"+
    "\16\3\2\0\3\3\1\0\2\3\6\0\1\3\6\0"+
    "\5\3\1\61\3\3\2\0\16\3\2\0\3\3\1\0"+
    "\2\3\6\0\1\3\6\0\11\3\2\0\1\3\1\62"+
    "\14\3\2\0\3\3\1\0\2\3\6\0\1\3\6\0"+
    "\11\3\2\0\1\3\1\63\14\3\2\0\3\3\1\0"+
    "\2\3\6\0\1\3\6\0\11\3\2\0\1\3\1\64"+
    "\14\3\2\0\3\3\1\0\2\3\6\0\1\3\6\0"+
    "\11\3\2\0\1\3\1\65\14\3\2\0\3\3\1\0"+
    "\2\3\6\0\1\3\6\0\11\3\2\0\1\66\15\3"+
    "\2\0\3\3\15\50\1\0\40\50\2\0\1\51\11\0"+
    "\1\67\40\0\1\51\1\0\2\3\6\0\1\3\6\0"+
    "\1\40\10\3\2\0\16\3\2\0\3\3\1\0\2\3"+
    "\6\0\1\3\6\0\11\3\2\0\13\3\1\70\2\3"+
    "\2\0\3\3\1\0\2\3\6\0\1\3\6\0\11\3"+
    "\2\0\6\3\1\71\7\3\2\0\3\3\1\0\2\3"+
    "\6\0\1\3\6\0\7\3\1\72\1\3\2\0\16\3"+
    "\2\0\3\3\1\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\73\6\3\2\0\16\3\2\0\3\3\1\0\2\3"+
    "\6\0\1\3\6\0\11\3\1\74\1\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\11\3\2\0"+
    "\1\3\1\75\14\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\3\3\1\37\5\3\2\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\11\3\2\0"+
    "\6\3\1\57\7\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\10\3\1\40\2\0\16\3\2\0\3\3"+
    "\1\0\2\3\6\0\1\3\6\0\2\3\1\52\6\3"+
    "\2\0\16\3\2\0\3\3\1\0\2\3\6\0\1\3"+
    "\6\0\10\3\1\76\2\0\16\3\2\0\3\3\1\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\77\6\3\2\0"+
    "\16\3\2\0\3\3\1\0\2\3\6\0\1\3\6\0"+
    "\11\3\2\0\13\3\1\40\2\3\2\0\3\3\1\0"+
    "\2\3\6\0\1\3\6\0\11\3\2\0\10\3\1\100"+
    "\1\101\4\3\2\0\1\102\1\103\1\3\1\0\2\3"+
    "\6\0\1\3\6\0\4\3\1\104\4\3\2\0\16\3"+
    "\2\0\3\3\1\0\2\3\6\0\1\3\6\0\1\105"+
    "\10\3\2\0\16\3\2\0\3\3\32\0\1\106\24\0"+
    "\2\3\6\0\1\3\6\0\10\3\1\107\2\0\16\3"+
    "\2\0\3\3\1\0\2\3\6\0\1\3\6\0\6\3"+
    "\1\110\2\3\2\0\16\3\2\0\3\3\1\0\2\3"+
    "\6\0\1\3\6\0\11\3\2\0\1\3\1\111\14\3"+
    "\2\0\3\3\1\0\2\3\6\0\1\3\6\0\10\3"+
    "\1\112\2\0\16\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\113\6\3\2\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\11\3\2\0"+
    "\1\3\1\114\14\3\2\0\3\3\1\0\2\3\6\0"+
    "\1\3\6\0\5\3\1\115\3\3\2\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\10\3\1\116"+
    "\2\0\16\3\2\0\3\3\1\0\2\3\6\0\1\3"+
    "\6\0\3\3\1\117\5\3\2\0\16\3\2\0\3\3"+
    "\1\0\1\120\7\0\1\120\6\0\11\120\2\0\16\120"+
    "\2\0\2\120\2\0\2\3\6\0\1\3\6\0\11\3"+
    "\2\0\3\3\1\57\12\3\2\0\3\3\1\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\63\6\3\2\0\16\3"+
    "\2\0\3\3\1\0\2\3\6\0\1\3\6\0\1\3"+
    "\1\40\7\3\2\0\16\3\2\0\3\3\1\0\2\3"+
    "\6\0\1\3\6\0\6\3\1\121\2\3\2\0\16\3"+
    "\2\0\3\3\1\0\2\3\6\0\1\3\6\0\5\3"+
    "\1\122\3\3\2\0\16\3\2\0\3\3\1\0\2\3"+
    "\6\0\1\3\6\0\10\3\1\123\2\0\16\3\2\0"+
    "\3\3\1\0\2\3\6\0\1\3\6\0\5\3\1\124"+
    "\3\3\2\0\16\3\2\0\3\3\1\125\1\126\1\127"+
    "\6\125\1\126\3\125\1\0\1\130\1\125\10\126\1\131"+
    "\2\125\16\126\2\125\2\126\1\127\1\0\2\3\6\0"+
    "\1\3\6\0\10\3\1\57\2\0\16\3\2\0\3\3"+
    "\1\0\2\120\3\0\1\132\2\0\1\120\5\0\1\133"+
    "\11\120\2\0\16\120\2\0\3\120\1\0\2\3\6\0"+
    "\1\3\1\134\5\0\11\3\2\0\16\3\2\0\3\3"+
    "\1\0\2\3\6\0\1\3\6\0\3\3\1\135\5\3"+
    "\2\0\16\3\2\0\3\3\1\0\2\3\6\0\1\3"+
    "\6\0\1\136\10\3\2\0\16\3\2\0\3\3\1\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\137\6\3\2\0"+
    "\16\3\2\0\3\3\2\0\1\125\14\0\1\140\35\0"+
    "\1\125\1\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\11\126\2\0\16\126\2\0\3\126\1\125"+
    "\1\143\1\127\6\125\1\143\3\125\1\0\1\125\1\144"+
    "\11\143\2\125\16\143\2\125\2\143\1\127\1\0\1\145"+
    "\1\130\1\0\1\145\1\0\1\145\2\0\1\145\4\0"+
    "\1\142\1\140\11\145\2\0\16\145\2\0\2\145\1\130"+
    "\1\0\2\126\6\0\1\126\1\141\1\0\1\142\2\0"+
    "\1\140\1\146\10\126\2\0\16\126\2\0\3\126\33\0"+
    "\1\147\1\150\1\151\1\0\1\152\1\153\17\0\1\154"+
    "\7\0\1\155\42\0\1\154\1\0\2\3\6\0\1\3"+
    "\6\0\6\3\1\156\2\3\2\0\16\3\2\0\3\3"+
    "\1\0\2\3\6\0\1\3\1\157\5\0\11\3\2\0"+
    "\16\3\2\0\3\3\1\0\2\3\6\0\1\3\6\0"+
    "\1\160\10\3\2\0\16\3\2\0\3\3\14\0\1\161"+
    "\2\0\1\140\55\0\1\140\37\0\1\3\1\143\6\0"+
    "\1\3\5\0\1\140\11\3\2\0\16\3\2\0\2\3"+
    "\1\143\1\0\2\145\1\0\1\145\1\0\1\145\2\0"+
    "\1\145\4\0\1\142\1\0\11\145\2\0\16\145\2\0"+
    "\3\145\1\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\11\126\2\0\14\126\1\162\1\126\2\0"+
    "\3\126\25\0\1\163\60\0\1\164\53\0\1\165\51\0"+
    "\1\166\60\0\1\167\32\0\1\154\11\0\1\170\40\0"+
    "\1\154\13\0\1\171\43\0\2\3\6\0\1\3\1\172"+
    "\5\0\11\3\2\0\16\3\2\0\3\3\16\0\1\173"+
    "\40\0\2\3\6\0\1\3\6\0\3\3\1\174\5\3"+
    "\2\0\16\3\2\0\3\3\2\0\1\125\7\0\1\175"+
    "\42\0\1\125\1\0\2\126\6\0\1\126\1\141\1\0"+
    "\1\142\2\0\1\140\11\126\2\0\1\176\1\177\1\200"+
    "\1\126\1\201\1\202\10\126\2\0\3\126\25\0\1\203"+
    "\56\0\1\204\53\0\1\205\56\0\1\206\64\0\1\207"+
    "\40\0\1\210\40\0\1\211\52\0\1\211\2\212\1\213"+
    "\12\212\1\0\37\212\1\213\1\0\2\173\1\0\1\173"+
    "\1\0\1\173\2\0\1\173\4\0\1\214\1\0\11\173"+
    "\2\0\16\173\2\0\3\173\1\0\2\3\6\0\1\3"+
    "\6\0\10\3\1\215\2\0\16\3\2\0\3\3\13\0"+
    "\1\216\43\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\5\126\1\217\3\126\2\0\16\126\2\0"+
    "\3\126\1\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\10\126\1\220\2\0\16\126\2\0\3\126"+
    "\1\0\2\126\6\0\1\126\1\141\1\0\1\142\2\0"+
    "\1\140\6\126\1\221\2\126\2\0\16\126\2\0\3\126"+
    "\1\0\2\126\6\0\1\126\1\141\1\0\1\142\2\0"+
    "\1\140\2\126\1\222\6\126\2\0\16\126\2\0\3\126"+
    "\1\0\2\126\6\0\1\126\1\141\1\0\1\142\2\0"+
    "\1\140\5\126\1\223\3\126\2\0\16\126\2\0\3\126"+
    "\22\0\1\224\64\0\1\225\60\0\1\226\44\0\1\164"+
    "\73\0\1\204\16\0\1\211\11\0\1\227\40\0\1\211"+
    "\2\0\1\212\11\0\1\230\40\0\3\212\1\213\11\212"+
    "\1\231\1\0\37\212\1\213\14\0\1\232\42\0\2\3"+
    "\6\0\1\3\1\233\5\0\11\3\2\0\16\3\2\0"+
    "\3\3\2\0\1\234\52\0\1\234\1\0\2\126\6\0"+
    "\1\126\1\141\1\0\1\142\2\0\1\140\5\126\1\235"+
    "\3\126\2\0\16\126\2\0\3\126\1\0\2\126\6\0"+
    "\1\126\1\141\1\0\1\142\2\0\1\140\6\126\1\236"+
    "\2\126\2\0\16\126\2\0\3\126\1\0\2\126\6\0"+
    "\1\126\1\141\1\0\1\142\2\0\1\140\4\126\1\237"+
    "\4\126\2\0\16\126\2\0\3\126\1\0\2\126\6\0"+
    "\1\126\1\141\1\0\1\142\2\0\1\140\5\126\1\240"+
    "\3\126\2\0\16\126\2\0\3\126\1\0\2\126\6\0"+
    "\1\126\1\141\1\0\1\142\2\0\1\140\11\126\2\0"+
    "\1\126\1\241\14\126\2\0\3\126\20\0\1\242\67\0"+
    "\1\243\53\0\1\244\41\0\1\170\60\0\1\245\40\0"+
    "\1\212\11\0\1\230\2\0\1\245\35\0\1\212\17\0"+
    "\1\246\113\0\1\247\2\0\1\234\11\0\1\142\40\0"+
    "\1\234\1\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\2\126\1\250\6\126\2\0\16\126\2\0"+
    "\3\126\1\0\2\126\2\0\1\142\3\0\1\126\1\141"+
    "\1\0\1\142\2\0\1\140\11\126\2\0\16\126\2\0"+
    "\3\126\1\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\11\126\2\0\1\126\1\251\14\126\2\0"+
    "\3\126\1\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\3\126\1\220\5\126\2\0\16\126\2\0"+
    "\3\126\1\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\11\126\2\0\6\126\1\236\7\126\2\0"+
    "\3\126\23\0\1\252\33\0\1\253\7\0\1\253\6\0"+
    "\11\253\2\0\16\253\2\0\2\253\37\0\1\204\33\0"+
    "\1\254\42\0\2\126\6\0\1\126\1\141\1\0\1\142"+
    "\2\0\1\140\1\255\10\126\2\0\16\126\2\0\3\126"+
    "\1\0\2\126\6\0\1\126\1\141\1\0\1\142\2\0"+
    "\1\140\10\126\1\256\2\0\16\126\2\0\3\126\30\0"+
    "\1\204\26\0\2\253\3\0\1\132\2\0\1\253\6\0"+
    "\11\253\2\0\16\253\2\0\3\253\17\0\1\257\37\0"+
    "\2\126\6\0\1\126\1\141\1\0\1\142\2\0\1\140"+
    "\3\126\1\260\5\126\2\0\16\126\2\0\3\126\1\0"+
    "\2\126\6\0\1\126\1\141\1\0\1\142\2\0\1\140"+
    "\11\126\2\0\3\126\1\236\12\126\2\0\3\126\1\0"+
    "\2\126\6\0\1\126\1\141\1\0\1\142\2\0\1\140"+
    "\10\126\1\236\2\0\16\126\2\0\3\126";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7498];
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
    "\1\1\1\11\5\1\1\11\16\1\1\11\2\1\1\0"+
    "\16\1\1\0\15\1\1\11\4\1\1\0\30\1\1\0"+
    "\2\1\1\0\1\1\1\0\1\11\1\0\3\1\1\11"+
    "\2\0\2\1\1\0\1\1\7\0\1\1\1\0\1\1"+
    "\1\0\1\1\11\0\1\1\1\0\5\1\5\0\1\11"+
    "\4\0\1\1\1\0\5\1\11\0\5\1\3\0\2\11"+
    "\1\0\2\1\1\0\1\1\1\0\2\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[176];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 9: 
          { lexeme=yytext(); return OpUnario;
          }
        case 22: break;
        case 19: 
          { lexeme=yytext(); return funcao_readLine;
          }
        case 23: break;
        case 6: 
          { lexeme=yytext(); return Op;
          }
        case 24: break;
        case 21: 
          { lexeme=yytext(); return funcao_readBoolean;
          }
        case 25: break;
        case 20: 
          { lexeme=yytext(); return ListaParam;
          }
        case 26: break;
        case 8: 
          { lexeme=yytext(); return Enter;
          }
        case 27: break;
        case 13: 
          { lexeme=yytext(); return Tipo;
          }
        case 28: break;
        case 5: 
          { lexeme=yytext(); return Simbolo;
          }
        case 29: break;
        case 12: 
          { lexeme=yytext(); return TipoPrimitivo;
          }
        case 30: break;
        case 7: 
          { lexeme=yytext(); return Tab;
          }
        case 31: break;
        case 14: 
          { lexeme=yytext(); return Param;
          }
        case 32: break;
        case 15: 
          { lexeme=yytext(); return DeclaracaoVar;
          }
        case 33: break;
        case 2: 
          { return ERROR;
          }
        case 34: break;
        case 16: 
          { lexeme=yytext(); return Retorno;
          }
        case 35: break;
        case 11: 
          { /*Ignore*/
          }
        case 36: break;
        case 17: 
          { lexeme=yytext(); return funcao_readInt;
          }
        case 37: break;
        case 18: 
          { lexeme=yytext(); return funcao_readFloat;
          }
        case 38: break;
        case 1: 
          { lexeme=yytext(); return E;
          }
        case 39: break;
        case 3: 
          { lexeme=yytext(); return ID;
          }
        case 40: break;
        case 4: 
          { lexeme=yytext(); return ConstInteira;
          }
        case 41: break;
        case 10: 
          { lexeme=yytext(); return Reservadas;
          }
        case 42: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
