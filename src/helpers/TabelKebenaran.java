package helpers;

/**
 *
 * @author skadevz
 */
public class TabelKebenaran {

    public boolean negasi(boolean p) {
        // NOT OPERATOR > Negation
        // \u00AC
        return !p;
    }    
    
    public boolean konjungsi(boolean p, boolean q) {
        // AND OPERATOR > Conjunction
        // \u2227
        return p && q;
    }
    
    public boolean inDisjungsi(boolean p, boolean q) {
        // OR OPERATOR > Disjunction
        // \u2228
        return p || q;
    }
    
    public boolean ekDisjungsi(boolean p, boolean q) {
        // XOR OPERATOR > Exclusive Disjunction
        // \u2295
        // return (p == true && q == false) || (p == false && q == true);
        return !(p == q);
    }
    
    public boolean kondisi(boolean p, boolean q) {
        // Implication or Conditional
        // \u27F6 > Implication or Conditional
        return !(p == true && q == false);
 
   }
    
    public boolean bikondisi(boolean p, boolean q) {
        // Equality or Biconditional
        // \u27F7 > Equality or Biconditional
        return p == q;
    }
    
}
