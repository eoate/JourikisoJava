package jourikisoJava5;

import static jourikisoJava5.SinritiHenkan.*;

public class Ganni {
    //含意を関数として実装する
    public static boolean implication(boolean a, boolean b){
        return !a || b;
    }
    public static void main(String[] args){
        System.out.println(implication(false,false)); //出力:true
    }
}
