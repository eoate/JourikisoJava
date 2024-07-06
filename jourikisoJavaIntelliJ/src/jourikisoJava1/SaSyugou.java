package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class SaSyugou {
    public static void main(String[] args) {
        //補集合numbersS1\numbersS2を実装する
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2,3,5,7));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(1,3,4,5,6));
        HashSet<Integer> numbersS1_2 = new HashSet<>();
        for(Integer i : numbersS1){
            if(!numbersS2.contains(i)){
                numbersS1_2.add(i);
            }
        }
        System.out.println(numbersS1_2); //出力:[2, 7]
    }
}
