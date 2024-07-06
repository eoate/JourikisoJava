package jourikisoJava1;

import java.util.ArrayList;
import java.util.Arrays;

public class Junjotui {
    public static void main(String[] args) {
        //順序対を実装するには、ArrayListに二つだけ値を入れればよい
        ArrayList<Integer> numbersA = new ArrayList<>(Arrays.asList(1,2));
        System.out.println(numbersA); //出力:[1, 2]
        //setメソッドを用いるとすでにあるn番目の要素を変更できる
        numbersA.set(0,4);
        numbersA.set(1,9);
        System.out.println(numbersA); //出力:[4, 9]
    }
}
