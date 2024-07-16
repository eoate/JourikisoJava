package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Ketugousoku {
    public static void main(String[] args) {
        //結合則が成り立つことの証明を実装する
        HashSet<Integer> numbers1 = new HashSet<>(Set.of(1,2,3,4,5));
        HashSet<Integer> numbers2 = new HashSet<>(Set.of(2,3,4,5,6));
        HashSet<Integer> numbers3 = new HashSet<>(Set.of(1,3,5,7,9));
        HashSet<Integer> numbers12 = KyotuBubunSyugou.intersection(numbers1, numbers2);
        HashSet<Integer> numbers23 = KyotuBubunSyugou.intersection(numbers2, numbers3);
        HashSet<Integer> numbers12_3 = KyotuBubunSyugou.intersection(numbers12, numbers3);
        HashSet<Integer> numbers1_23 = KyotuBubunSyugou.intersection(numbers1, numbers23);

        if(numbers1_23.equals(numbers12_3))System.out.println("結合則は成り立つ");
        //出力:結合則は成り立つ
    }
}
