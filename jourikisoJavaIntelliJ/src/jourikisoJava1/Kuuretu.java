package jourikisoJava1;

import java.util.ArrayList;

public class Kuuretu {
    public static void main(String[] args) {
        //要素がない組を列にする。
        ArrayList<String> aaa = new ArrayList<>();
        for(String c : aaa)System.out.print(c); //出力:
        //System.out.print(aaa)はエラーが出る。
    }
}
