package jourikisoJava5;

import static jourikisoJava5.SinritiHenkan.truthValue;

public class DoutiSoku {
    public static void main(String[] args){
        boolean commutativity=true;
        x:for(int a=0; a<=1; a++){
            for(int b=0; b<=1; b++){
                if(!((truthValue(a)==truthValue(b)) == (truthValue(b)==truthValue(a)))){
                    commutativity = false;
                    break x;
                }
            }
        }
        if(commutativity){
            System.out.println("同値の交換則は成り立つ");
        }else{
            System.out.println("同値の交換則は成り立たない");
        }

        boolean associativity=true;
        y:for(int a=0; a<=1; a++) {
            for (int b = 0; b <= 1; b++) {
                for (int c = 0; c <= 1; c++) {
                    if(!(((truthValue(a)==truthValue(b)) == truthValue(c))
                            ==(truthValue(a) == (truthValue(b)==truthValue(c))))){
                        associativity=false;
                        break y;
                    }
                }
            }
        }
        if(associativity){
            System.out.println("同値の結合則は成り立つ");
        }else{
            System.out.println("同値の結合則は成り立たない");
        }
    }
}
