package jourikisoJava2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ketugosoku {
    //ここでは、ある3つの関数の合成関数についていくつかの値を代入し結合則が成り立っていることを確認するのみとする
    public static int f(int n){
        return 3*n-4;
    }
    public static int g(int n){
        return 2*n-5;
    }
    public static int h(int n){
        return n+4;
    }

    public static int fg(int n){
        return f(g(n));
    }
    public static int gh(int n){
        return g(h(n));
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbersA = new ArrayList<>(Arrays.asList(1,5,7,9));
        boolean is = true;
        for (Integer n : numbersA) {
            if (fg(h(n)) != f(gh(n))) {
                System.out.println("結合則が成り立っていません");
                is = false;
                break;
            }
        }
        if(is){
            System.out.println("結合則は成り立っています");
        }
    } //出力:結合則は成り立っています
}
