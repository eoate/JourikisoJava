package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Wasyugou {
    public static HashSet<Integer> union(HashSet<Integer> numbers1, HashSet<Integer> numbers2) {
        HashSet<Integer> numbers12s = new HashSet<>();
        numbers12s.addAll(numbers1);
        numbers12s.addAll(numbers2);
        return numbers12s;
    }

    public static void main(String[] args) {
        //和集合を実装する。同じ要素は一つになるのでaddAllメソッドを二回用いればよい
        HashSet<Integer> numbers1 = new HashSet<>(Set.of(1,3,5));
        HashSet<Integer> numbers2 = new HashSet<>(Set.of(2,4,6));

        System.out.println(union(numbers1,numbers2)); //出力:[1, 2, 3, 4, 5, 6]
        //和集合のべき等則、交換則、結合則の証明は共通部分集合の場合と似ているため省略する。
    }
}
