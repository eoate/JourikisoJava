package jourikisoJava1;

import java.util.ArrayList;
import java.util.Arrays;

public class RetuNagasa {
    public static void main(String[] args) {
        //[]なしで列を出力するために、組から値を一つずつ取り出す。最後に「,」がつかないよう工夫する。
        ArrayList<Integer> numbersA = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(int i=0; i<numbersA.size()-1; i++){
            System.out.print(numbersA.get(i) + ",");
        }
        System.out.println(numbersA.getLast());
        //出力:1,2,3,4,5
        //長さはsizeメソッドを用いて出力。上で出力されたものは文字列に変換されているためそこから長さを取得することはできない
        System.out.println(numbersA.size()); //出力:5
    }
}
