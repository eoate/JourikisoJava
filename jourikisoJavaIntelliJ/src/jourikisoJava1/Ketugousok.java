package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Ketugousok {
    public static void main(String[] args) {
        //結合則が成り立つことの証明を実装する
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2,3,4,5));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(2,3,4,5,6));
        HashSet<Integer> numbersS3 = new HashSet<>(Set.of(1,3,5,7,9));
        HashSet<Integer> numbersS12 = new HashSet<>();
        HashSet<Integer> numbersS23 = new HashSet<>();
        HashSet<Integer> numbersS12_3 = new HashSet<>();
        HashSet<Integer> numbersS1_23 = new HashSet<>();
        for (Integer i : numbersS1) {
            if (numbersS2.contains(i)) {
                numbersS12.add(i);
            }
        }
        for (Integer i : numbersS3) {
            if (numbersS12.contains(i)) {
                numbersS12_3.add(i);
            }
        }

        for (Integer i : numbersS3) {
            if (numbersS2.contains(i)) {
                numbersS23.add(i);
            }
        }
        for (Integer i : numbersS1) {
            if (numbersS23.contains(i)) {
                numbersS1_23.add(i);
            }
        }

        if(numbersS1_23.equals(numbersS12_3)){
            System.out.println("結合則は成り立つ");
        }else{
            System.out.println("結合則は成り立たない");
        }
        //出力:結合則は成り立つ
    }
}
