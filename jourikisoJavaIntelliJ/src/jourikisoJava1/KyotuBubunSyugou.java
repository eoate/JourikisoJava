package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class KyotuBubunSyugou {
    public static HashSet<Integer> intersection(HashSet<Integer> numbers1, HashSet<Integer> numbers2) {
        HashSet<Integer> numbers12 = new HashSet<>();
        for (Integer i : numbers1) {
            if (numbers2.contains(i)) {
                numbers12.add(i);
            }
        }
        return numbers12;
    }

    public static void main(String[] args) {
        //共通部分集合(積集合)は片方の巣別の要素一つ一つについてもう片方に含まれているかを調べ、含まれていれば共通部分集合に入れることで実装する。3つ以上の場合はこれを繰り返せばよい
        HashSet<Integer> numbers1 = new HashSet<>(Set.of(1,2,3,4,5));
        HashSet<Integer> numbers2 = new HashSet<>(Set.of(1,3,5,7,9));
        System.out.println(intersection(numbers1, numbers2)); //出力:[1, 3, 5]
    }
}
