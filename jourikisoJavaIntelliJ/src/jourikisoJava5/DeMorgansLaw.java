package jourikisoJava5;

import static jourikisoJava5.SinritiHenkan.*;

public class DeMorgansLaw {
    public static void main(String[] args){
        boolean deMorganA=true;
        x:for(int a=0; a<=1; a++){
            for(int b=0; b<=1; b++){
                if((!(truthValue(a) && truthValue(b)) != (!truthValue(a) || !truthValue(b)))){
                    deMorganA = false;
                    break x;
                }
            }
        }
        if(deMorganA){
            System.out.println("¬(α∧β)⇔¬α∨¬βが成り立つ");
        }else{
            System.out.println("¬(α∧β)⇔¬α∨¬βは成り立たない");
        }

        boolean deMorganB=true;
        y:for(int a=0; a<=1; a++){
            for(int b=0; b<=1; b++){
                if((!(truthValue(a) || truthValue(b)) != (!truthValue(a) && !truthValue(b)))){
                    deMorganB = false;
                    break y;
                }
            }
        }
        if(deMorganB){
            System.out.println("¬(α∨β)⇔¬α∧¬βが成り立つ");
        }else{
            System.out.println("¬(α∨β)⇔¬α∧¬βは成り立たない");
        }

        if(deMorganA && deMorganB){
            System.out.println("ド・モルガンの法則は成り立つ");
        }else{
            System.out.println("ド・モルガンの法則は成り立たない");
        }
    }
}
