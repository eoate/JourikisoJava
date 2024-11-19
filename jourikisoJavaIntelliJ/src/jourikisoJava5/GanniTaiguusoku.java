package jourikisoJava5;

import static jourikisoJava5.Ganni.*;
import static jourikisoJava5.SinritiHenkan.*;

public class GanniTaiguusoku {
    public static void main(String[] args){
        boolean contraposition=true;
        for(int a=0; a<=1; a++){
            for(int b=0; b<=1; b++){
                if(implication(truthValue(a),truthValue(b))){
                    if(!implication(!truthValue(b),!truthValue(a)))contraposition=false;
                }
            }
        }
        if(contraposition){
            System.out.println("対偶則は成り立つ");
        }else{
            System.out.println("対偶則は成り立たない");
        }
    }
}
