package jourikisoJava1;

import java.util.ArrayList;
import java.util.Arrays;

public class KumiSeibunOkisa {
    public static void main(String[] args) {
        //ArrayListやLinkedListクラスを使うと、順序が決まっている組を実装できる
        ArrayList<Integer> numbersA = new ArrayList<>(Arrays.asList(3,5,5,6));
        System.out.println(numbersA); //出力:[3, 5, 5, 6]
        //組の成分はgetメソッドを用いて取得できる。一つ目の要素は0番目、二つ目の要素は1番目...となる
        System.out.println("1番目の要素は" + numbersA.get(1)); //出力:1番目の要素は5
        //組の大きさはsizeメソッドを用いて取得できる
        System.out.println("numbersAは" + numbersA.size() + "つ組"); //出力:numbersAは4つ組
    }
}
