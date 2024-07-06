package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Koukansoku {
    public static void main(String[] args) {
        //交換則が成り立つことの証明を実装する。
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2,3,4,5));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(2,3,4,5,6));
        HashSet<Integer> numbersS12 = new HashSet<>();
        HashSet<Integer> numbersS21 = new HashSet<>();
        for (Integer i : numbersS1) {
            if (numbersS2.contains(i)) {
                numbersS12.add(i);
            }
        }
        for (Integer i : numbersS2) {
            if (numbersS1.contains(i)) {
                numbersS21.add(i);
            }
        }
        if(numbersS12.equals(numbersS21)){
            System.out.println("交換則は成り立つ");
        }else{
            System.out.println("交換則は成り立たない");
        }
    }
}
