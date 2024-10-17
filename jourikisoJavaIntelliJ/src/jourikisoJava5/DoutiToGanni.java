package jourikisoJava5;

import static jourikisoJava5.SinritiHenkan.*;
import static jourikisoJava5.Ganni.implication;

public class DoutiToGanni {
    public static void main(String[] args){
        boolean proposition = true;
        x:for(int a=0; a<=1; a++) {
            for (int b = 0; b <= 1; b++) {
                boolean equivalence = truthValue(a) == truthValue(b);
                boolean implication = implication(truthValue(a), truthValue(b)) && implication(truthValue(b), truthValue(a));
                if(equivalence != implication){
                    proposition = false;
                    break x;
                }
            }
        }
        if(proposition){
            System.out.println("(α⇔β)⇔((α⇒β)∧(β⇒α))が成り立つ");
        }else{
            System.out.println("(α⇔β)⇔((α⇒β)∧(β⇒α))は成り立たない");
        }
    }
}
