
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Dec 11 15:59:59 GMT-03:00 2019
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Dec 11 15:59:59 GMT-03:00 2019
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\051\000\002\002\004\000\002\002\003\000\002\003" +
    "\017\000\002\003\015\000\002\004\006\000\002\005\003" +
    "\000\002\006\023\000\002\007\003\000\002\010\005\000" +
    "\002\011\007\000\002\012\021\000\002\012\025\000\002" +
    "\013\005\000\002\014\006\000\002\014\003\000\002\016" +
    "\003\000\002\016\003\000\002\016\003\000\002\016\003" +
    "\000\002\016\003\000\002\016\003\000\002\017\013\000" +
    "\002\017\016\000\002\020\011\000\002\021\013\000\002" +
    "\022\013\000\002\023\011\000\002\023\015\000\002\024" +
    "\011\000\002\025\007\000\002\025\004\000\002\025\007" +
    "\000\002\025\011\000\002\025\003\000\002\025\003\000" +
    "\002\025\003\000\002\025\003\000\002\025\003\000\002" +
    "\025\013\000\002\025\005\000\002\025\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\262\000\004\004\005\001\002\000\004\002\000\001" +
    "\002\000\004\050\010\001\002\000\004\002\007\001\002" +
    "\000\004\002\001\001\002\000\004\010\011\001\002\000" +
    "\004\050\012\001\002\000\004\045\013\001\002\000\004" +
    "\050\014\001\002\000\004\032\015\001\002\000\004\050" +
    "\016\001\002\000\006\004\022\036\017\001\002\000\006" +
    "\030\262\050\ufff3\001\002\000\004\050\256\001\002\000" +
    "\004\050\254\001\002\000\004\050\231\001\002\000\004" +
    "\050\024\001\002\000\004\045\025\001\002\000\004\050" +
    "\026\001\002\000\004\026\027\001\002\000\004\050\030" +
    "\001\002\000\004\036\017\001\002\000\004\050\ufffa\001" +
    "\002\000\004\050\036\001\002\000\004\050\034\001\002" +
    "\000\004\045\035\001\002\000\004\050\ufff9\001\002\000" +
    "\004\027\037\001\002\000\004\050\040\001\002\000\004" +
    "\032\041\001\002\000\004\050\042\001\002\000\004\036" +
    "\017\001\002\000\004\050\050\001\002\000\004\050\045" +
    "\001\002\000\004\045\046\001\002\000\004\017\047\001" +
    "\002\000\004\050\ufffd\001\002\000\014\012\053\014\052" +
    "\015\062\016\055\045\060\001\002\000\004\050\uffed\001" +
    "\002\000\004\050\223\001\002\000\006\026\201\050\200" +
    "\001\002\000\004\050\ufff0\001\002\000\004\050\170\001" +
    "\002\000\004\050\ufff2\001\002\000\004\050\uffee\001\002" +
    "\000\004\050\144\001\002\000\004\050\ufff1\001\002\000" +
    "\004\050\067\001\002\000\004\050\065\001\002\000\004" +
    "\050\uffef\001\002\000\004\033\066\001\002\000\004\050" +
    "\ufffb\001\002\000\004\026\070\001\002\000\004\050\071" +
    "\001\002\000\026\011\076\026\104\035\072\037\073\040" +
    "\074\041\103\042\075\043\101\044\100\045\077\001\002" +
    "\000\004\050\142\001\002\000\004\050\136\001\002\000" +
    "\004\050\uffe0\001\002\000\004\050\uffde\001\002\000\004" +
    "\050\126\001\002\000\004\050\115\001\002\000\004\050" +
    "\uffdc\001\002\000\004\050\uffdd\001\002\000\004\050\111" +
    "\001\002\000\004\050\uffdf\001\002\000\004\050\105\001" +
    "\002\000\026\011\076\026\104\035\072\037\073\040\074" +
    "\041\103\042\075\043\101\044\100\045\077\001\002\000" +
    "\004\050\107\001\002\000\004\027\110\001\002\000\004" +
    "\050\uffd9\001\002\000\004\027\112\001\002\000\004\050" +
    "\113\001\002\000\004\017\114\001\002\000\004\050\uffe9" +
    "\001\002\000\010\026\117\030\116\050\uffe3\001\002\000" +
    "\004\050\124\001\002\000\004\050\120\001\002\000\026" +
    "\011\076\026\104\035\072\037\073\040\074\041\103\042" +
    "\075\043\101\044\100\045\077\001\002\000\004\050\122" +
    "\001\002\000\004\027\123\001\002\000\004\050\uffe1\001" +
    "\002\000\004\031\125\001\002\000\004\050\uffe2\001\002" +
    "\000\004\036\127\001\002\000\004\050\130\001\002\000" +
    "\004\030\131\001\002\000\004\050\132\001\002\000\026" +
    "\011\076\026\104\035\072\037\073\040\074\041\103\042" +
    "\075\043\101\044\100\045\077\001\002\000\004\050\134" +
    "\001\002\000\004\031\135\001\002\000\004\050\uffdb\001" +
    "\002\000\004\034\137\001\002\000\004\050\140\001\002" +
    "\000\004\037\141\001\002\000\004\050\uffe4\001\002\000" +
    "\026\011\076\026\104\035\072\037\073\040\074\041\103" +
    "\042\075\043\101\044\100\045\077\001\002\000\004\050" +
    "\uffda\001\002\000\010\021\147\026\146\030\145\001\002" +
    "\000\004\050\160\001\002\000\004\050\154\001\002\000" +
    "\004\050\150\001\002\000\026\011\076\026\104\035\072" +
    "\037\073\040\074\041\103\042\075\043\101\044\100\045" +
    "\077\001\002\000\004\050\152\001\002\000\004\017\153" +
    "\001\002\000\004\050\uffe7\001\002\000\026\011\076\026" +
    "\104\035\072\037\073\040\074\041\103\042\075\043\101" +
    "\044\100\045\077\001\002\000\004\050\156\001\002\000" +
    "\004\027\157\001\002\000\004\050\uffe5\001\002\000\026" +
    "\011\076\026\104\035\072\037\073\040\074\041\103\042" +
    "\075\043\101\044\100\045\077\001\002\000\004\050\162" +
    "\001\002\000\004\031\163\001\002\000\004\050\164\001" +
    "\002\000\004\021\165\001\002\000\004\050\166\001\002" +
    "\000\026\011\076\026\104\035\072\037\073\040\074\041" +
    "\103\042\075\043\101\044\100\045\077\001\002\000\004" +
    "\050\uffe6\001\002\000\004\026\171\001\002\000\004\050" +
    "\172\001\002\000\026\011\076\026\104\035\072\037\073" +
    "\040\074\041\103\042\075\043\101\044\100\045\077\001" +
    "\002\000\004\050\174\001\002\000\004\027\175\001\002" +
    "\000\004\050\176\001\002\000\004\017\177\001\002\000" +
    "\004\050\uffe8\001\002\000\004\026\214\001\002\000\004" +
    "\050\202\001\002\000\026\011\076\026\104\035\072\037" +
    "\073\040\074\041\103\042\075\043\101\044\100\045\077" +
    "\001\002\000\004\050\204\001\002\000\004\027\205\001" +
    "\002\000\004\050\206\001\002\000\014\012\053\014\052" +
    "\015\062\016\055\045\060\001\002\000\004\050\210\001" +
    "\002\000\004\013\211\001\002\000\004\050\212\001\002" +
    "\000\014\012\053\014\052\015\062\016\055\045\060\001" +
    "\002\000\004\050\uffeb\001\002\000\004\050\215\001\002" +
    "\000\026\011\076\026\104\035\072\037\073\040\074\041" +
    "\103\042\075\043\101\044\100\045\077\001\002\000\004" +
    "\050\217\001\002\000\004\027\220\001\002\000\004\050" +
    "\221\001\002\000\014\012\053\014\052\015\062\016\055" +
    "\045\060\001\002\000\004\050\uffec\001\002\000\004\026" +
    "\224\001\002\000\004\050\225\001\002\000\026\011\076" +
    "\026\104\035\072\037\073\040\074\041\103\042\075\043" +
    "\101\044\100\045\077\001\002\000\004\050\227\001\002" +
    "\000\004\027\230\001\002\000\004\050\uffea\001\002\000" +
    "\004\005\232\001\002\000\004\050\233\001\002\000\004" +
    "\006\234\001\002\000\004\050\235\001\002\000\004\007" +
    "\236\001\002\000\004\050\237\001\002\000\004\026\240" +
    "\001\002\000\004\050\241\001\002\000\004\027\242\001" +
    "\002\000\004\050\243\001\002\000\004\032\244\001\002" +
    "\000\004\050\245\001\002\000\006\033\247\036\017\001" +
    "\002\000\004\050\250\001\002\000\004\050\ufff7\001\002" +
    "\000\014\012\053\014\052\015\062\016\055\045\060\001" +
    "\002\000\004\050\252\001\002\000\004\033\253\001\002" +
    "\000\004\050\ufff6\001\002\000\004\033\255\001\002\000" +
    "\004\002\ufffe\001\002\000\004\004\022\001\002\000\004" +
    "\050\260\001\002\000\004\033\261\001\002\000\004\002" +
    "\uffff\001\002\000\004\050\263\001\002\000\004\031\264" +
    "\001\002\000\004\050\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\262\000\006\002\005\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\006\017\012\020\014\022\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\007\031\010\030\014\032" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\004\042\014\043\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\020\016\062\017\055\020\060\021\053\022\063" +
    "\023\056\024\050\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\025\101\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\025\105\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\025" +
    "\120\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\025\132\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\025\142\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\025\150\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\025\154\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\025\160\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\025\166\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\025" +
    "\172\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\025\202\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\020\016" +
    "\206\017\055\020\060\021\053\022\063\023\056\024\050" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\020\016\212\017\055\020\060\021\053\022\063" +
    "\023\056\024\050\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\025\215\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\020\016\221\017\055\020" +
    "\060\021\053\022\063\023\056\024\050\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\025" +
    "\225\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\004\245\014\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\020\016\250\017\055\020\060\021\053\022\063" +
    "\023\056\024\050\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\256\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // EXPRESSAO ::= AbreParentese E EXPRESSAO E FechaParentese 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // EXPRESSAO ::= OpUnario E EXPRESSAO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // EXPRESSAO ::= New E TipoPrimitivo E AbreCochete E EXPRESSAO E FechaCochete 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // EXPRESSAO ::= False 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // EXPRESSAO ::= True 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // EXPRESSAO ::= ConstString 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // EXPRESSAO ::= ConstReal 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // EXPRESSAO ::= ConstInteira 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // EXPRESSAO ::= ID E AbreParentese E EXPRESSAO E FechaParentese 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // EXPRESSAO ::= ID E AbreCochete E FechaCochete 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // EXPRESSAO ::= ID E 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // EXPRESSAO ::= Digito E Op E Digito 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESSAO",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // CMDFUNC ::= ID E AbreParentese E EXPRESSAO E FechaParentese 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMDFUNC",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // CMDATRIB ::= ID E AbreCochete E EXPRESSAO E FechaCochete E Igual E EXPRESSAO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMDATRIB",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // CMDATRIB ::= ID E Igual E EXPRESSAO E PontoVirgula 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMDATRIB",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CMDPRINTLN ::= Println E AbreParentese E EXPRESSAO E FechaParentese E PontoVirgula 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMDPRINTLN",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CMDPRINT ::= Print E AbreParentese E EXPRESSAO E FechaParentese E PontoVirgula 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMDPRINT",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CMDWHILE ::= While E AbreParentese E EXPRESSAO E FechaParentese 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMDWHILE",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // CMDIF ::= If AbreParentese E EXPRESSAO E FechaParentese E CMD E Else E CMD 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMDIF",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-11)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // CMDIF ::= If E AbreParentese E EXPRESSAO E FechaParentese E CMD 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMDIF",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // CMD ::= CMDFUNC 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMD",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // CMD ::= CMDATRIB 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMD",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CMD ::= CMDPRINTLN 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMD",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // CMD ::= CMDPRINT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMD",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // CMD ::= CMDWHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMD",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // CMD ::= CMDIF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CMD",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // TIPO ::= TipoPrimitivo 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // TIPO ::= TipoPrimitivo AbreCochete E FechaCochete 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCA ::= DECLARACAOVAR E LISTACMD 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // MAIN ::= Public E Static E Void E Main E AbreParentese E FechaParentese E AbreChave E DECLARACAOVAR E CMD E FechaChave 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MAIN",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-18)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // MAIN ::= Public E Static E Void E Main E AbreParentese E FechaParentese E AbreChave E FechaChave 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MAIN",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-14)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // RETORNO ::= Retorno E ID E PontoVirgula 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RETORNO",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // PARAM ::= TIPO E ID 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAM",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LISTAPARAM ::= PARAM 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTAPARAM",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // METODO ::= TIPO E ID E AbreParentese E LISTAPARAM E FechaParentese E AbreChave E DECLARACAOVAR E CMD E FechaChave 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("METODO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-16)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LISTAMETODO ::= METODO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTAMETODO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DECLARACAOVAR ::= TIPO E ID PontoVirgula 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACAOVAR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CLASSE ::= Public E Class E ID E AbreChave E MAIN E FechaChave 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CLASSE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CLASSE ::= Public E Class E ID E AbreChave E METODO E MAIN E FechaChave 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CLASSE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-12)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROGRAMA ::= CLASSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROGRAMA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

