package jourikisoJava5;

import static jourikisoJava5.SinritiHenkan.*;

public class RonrisekiRonriwaBunpaisoku {
    public static void main(String[] args){
        boolean andDistributivity = true;
        x:for(int a=0; a<=1; a++){
            for(int b=0; b<=1; b++){
                for(int c=0; c<=1; c++){
                    if(!((truthValue(a) && (truthValue(b) || truthValue(c)))
                            == ((truthValue(a) && truthValue(b)) || (truthValue(a) && truthValue(c))))) {
                        andDistributivity = false;
                        break x;
                    }
                }
            }
        }
        if(andDistributivity){
            System.out.println("α∧(β∨γ)⇔(α∧β)∨(α∧γ)が成り立つ");
        }else{
            System.out.println("α∧(β∨γ)⇔(α∧β)∨(α∧γ)は成り立たない");
        }

        boolean orDistributivity = true;
        y:for(int a=0; a<=1; a++){
            for(int b=0; b<=1; b++){
                for(int c=0; c<=1; c++){
                    if(!((truthValue(a) || (truthValue(b) && truthValue(c)))
                            == ((truthValue(a) || truthValue(b)) && (truthValue(a) || truthValue(c))))) {
                        orDistributivity = false;
                        break y;
                    }
                }
            }
        }
        if(orDistributivity){
            System.out.println("α∨(β∧γ)⇔(α∨β)∧(α∨γ)が成り立つ");
        }else{
            System.out.println("α∨(β∧γ)⇔(α∨β)∧(α∨γ)は成り立たない");
        }
    }
}
