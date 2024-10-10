package jourikisoJava5;

import static jourikisoJava5.SinritiHenkan.*;

public class RonriwaNantokaSoku {
    public static void main(String[] args){
        boolean idempotency = true;
        for(int a=0; a<=1; a++){
            if(a !=truthValueNumber(truthValue(a) || truthValue(a))){
                idempotency = false;
                break;
            }
        }
        if(idempotency){
            System.out.println("論理和のべき等則は成り立つ");
        }else{
            System.out.println("論理和のべき等則は成り立たない");
        }

        boolean commutativity = true;
        g:for(int a=0; a<=1; a++){
            for(int b=0; b<=1; b++){
                if(truthValueNumber(truthValue(a) || truthValue(b)) != truthValueNumber(truthValue(b) || truthValue(a))){
                    commutativity = false;
                    break g;
                }
            }
        }
        if(commutativity){
            System.out.println("論理和の交換則は成り立つ");
        }else{
            System.out.println("論理和の交換則は成り立たない");
        }

        boolean associativity = true;
        g:for(int a=0; a<=1; a++) {
            for (int b=0; b<=1; b++){
                for(int c=0; c<=1; c++){
                    if(truthValueNumber((truthValue(a) || truthValue(b)) || truthValue(c)) != truthValueNumber(truthValue(a) || (truthValue(b) || truthValue(c)))){
                        associativity = false;
                        break g;
                    }
                }
            }
        }
        if(associativity){
            System.out.println("論理和の結合則は成り立つ");
        }else{
            System.out.println("論理和の結合則は成り立たない");
        }
    }
}
