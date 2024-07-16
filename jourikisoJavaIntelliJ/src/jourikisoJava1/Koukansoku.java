package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Koukansoku {
    public static void main(String[] args) {
        //交換則が成り立つことの証明を実装する。
        HashSet<Integer> numbers1 = new HashSet<>(Set.of(1,2,3,4,5));
        HashSet<Integer> numbers2 = new HashSet<>(Set.of(2,3,4,5,6));
        HashSet<Integer> numbers12 = KyotuBubunSyugou.intersection(numbers1, numbers2);
        HashSet<Integer> numbers21 = KyotuBubunSyugou.intersection(numbers2, numbers1);
        if(numbers12.equals(numbers21))System.out.println("交換則は成り立つ");
        //出力:交換則は成り立つ
    }
}
