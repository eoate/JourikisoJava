package jourikisoJava5;

import static jourikisoJava5.SinritiHenkan.*;
import static jourikisoJava5.Ganni.*;

public class Sinritihyou {
    //各論理結合子について真理値表を書きだすプログラムを実装する。
    public static void main(String[] args){
        System.out.println("論理積の真理値表");
        System.out.println("a b |a∧b");
        System.out.println("--------");
        for(int a = 0; a<=1; a++){
            for(int b=0; b<=1; b++){
                System.out.println(a + " " + b + " | " + truthValueNumber(truthValue(a) && truthValue(b)));
            }
        }
        System.out.println("論理和の真理値表");
        System.out.println("a b |a∨b");
        System.out.println("--------");
        for(int a = 0; a<=1; a++){
            for(int b=0; b<=1; b++){
                System.out.println(a + " " + b + " | " + truthValueNumber(truthValue(a) || truthValue(b)));
            }
        }
        System.out.println("否定の真理値表");
        System.out.println("a |¬a");
        System.out.println("-----");
        for(int a = 0; a<=1; a++){
            System.out.println(a + " | " + truthValueNumber(!truthValue(a)));
        }
        System.out.println("含意の真理値表");
        System.out.println("a b |a⇒b");
        System.out.println("--------");
        for(int a = 0; a<=1; a++){
            for(int b=0; b<=1; b++){
                System.out.println(a + " " + b + " | " + truthValueNumber(implication(truthValue(a), truthValue(b))));
            }
        }
        System.out.println("同値の真理値表");
        System.out.println("a b |a⇔b");
        System.out.println("--------");
        for(int a = 0; a<=1; a++){
            for(int b=0; b<=1; b++){
                System.out.println(a + " " + b + " | " + truthValueNumber(truthValue(a) == truthValue(b)));
            }
        }
    }
}
