package jourikisoJava5;

import static jourikisoJava5.SinritiHenkan.*;

public class RonrisekiRonriwaKyuusyuusoku {
    public static void main(String[] args){
        boolean absorptivity = true;
        x:for(int a=0; a<=1; a++) {
            for (int b = 0; b <= 1; b++) {
                if(!((truthValue(a) && (truthValue(a) || truthValue(b)))
                        == truthValue(a) || (truthValue(a) && truthValue(b))
                        == truthValue(a))){
                    absorptivity = false;
                    break x;
                }
            }
        }
        if(absorptivity){
            System.out.println("α∧(α∨β)⇔α∨(α∧β)⇔αが成り立つ");
        }else{
            System.out.println("α∧(α∨β)⇔α∨(α∧β)⇔αは成り立たない");
        }
    }
}
