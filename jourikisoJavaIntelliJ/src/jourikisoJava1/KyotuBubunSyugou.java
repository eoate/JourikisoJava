package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class KyotuBubunSyugou {
    public static void main(String[] args) {
        //共通部分集合(積集合)は片方の巣別の要素一つ一つについてもう片方に含まれているかを調べ、含まれていれば共通部分集合に入れることで実装する。3つ以上の場合はこれを繰り返せばよい
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2,3,4,5));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(1,3,5,7,9));
        HashSet<Integer> numbersS12 = new HashSet<>();
        for (Integer i : numbersS1) {
            if (numbersS2.contains(i)) {
                numbersS12.add(i);
            }
        }
        System.out.println(numbersS12); //出力:[1, 3, 5]
    }
}
