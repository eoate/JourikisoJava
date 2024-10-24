package jourikisoJava5;

import static jourikisoJava5.Ganni.implication;
import static jourikisoJava5.SinritiHenkan.truthValue;

public class GanniToDouti {
    public static void main(String[] args){
        boolean propositionA = true;
        x:for(int a=0; a<=1; a++) {
            for (int b = 0; b <= 1; b++) {
                boolean conditionA = implication(truthValue(a), truthValue(b));
                boolean conditionB = !truthValue(a) || truthValue(b);
                if(conditionA != conditionB){
                    propositionA = false;
                    break x;
                }
            }
        }
        if(propositionA){
            System.out.println("(α⇒β)⇔(¬α∨β)が成り立つ");
        }else{
            System.out.println("(α⇒β)⇔(¬α∨β)は成り立たない");
        }

        boolean propositionB = true;
        y:for(int a=0; a<=1; a++) {
            for (int b = 0; b <= 1; b++) {
                boolean conditionA = truthValue(a) == truthValue(b);
                boolean conditionB = (truthValue(a) && truthValue(b)) || (!truthValue(a) && !truthValue(b));
                if(conditionA != conditionB){
                    propositionB = false;
                    break y;
                }
            }
        }
        if(propositionB){
            System.out.println("(α⇔β)⇔((α∧β)∨(¬α∧¬β))が成り立つ");
        }else{
            System.out.println("(α⇔β)⇔((α∧β)∨(¬α∧¬β))は成り立たない");
        }
    }
}
