package jourikisoJava1;

import java.util.ArrayList;
import java.util.Arrays;

public class Kigouretu {
    public static void main(String[] args) {
        //1文字の要素はCharacter型を用い、'で囲む。
        ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('b','a','n','a','n','a'));
        for(int i=0; i<alphabet.size()-1; i++){
            System.out.print(alphabet.get(i)+",");
        }
        System.out.println(alphabet.getLast());
        //出力:b,a,n,a,n,a
        //記号列は,なしで同様の出力をすればよい
        for (Character c : alphabet) System.out.print(c); //出力:banana
    }
}
