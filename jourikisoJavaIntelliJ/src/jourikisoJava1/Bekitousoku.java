package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Bekitousoku {
    public static void main(String[] args) {
        //べき等則が成り立つことの証明を実装する。
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2,3,4,5));
        HashSet<Integer> numbersS11 = KyotuBubunSyugou.intersection(numbersS1, numbersS1);
        if(numbersS11.equals(numbersS1))System.out.println("べき等則は成り立つ");
        //出力:べき等則は成り立つ
    }
}
