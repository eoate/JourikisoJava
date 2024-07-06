package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Wasyugou {
    public static void main(String[] args) {
        //和集合を実装する。同じ要素は一つになるのでaddAllメソッドを二回用いればよい
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,3,5));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(2,4,6));
        HashSet<Integer> numbersS12s = new HashSet<>();
        numbersS12s.addAll(numbersS1);
        numbersS12s.addAll(numbersS2);
        System.out.println(numbersS12s); //出力:[1, 2, 3, 4, 5, 6]
        //和集合のべき等則、交換則、結合則の証明は共通部分集合の場合と似ているため省略する。
    }
}
