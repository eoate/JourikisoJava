package jourikisoJava3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Kankei {
    public static void main(String[] args) {
        //関係>を実装する
        HashSet<Integer> numbersA = new HashSet<>(Set.of(3,4,6,8));
        HashSet<Integer> numbersB = new HashSet<>(Set.of(1,4,5,9));
        HashSet<ArrayList<Integer>> numbersR = new HashSet<>();
        for (Integer i : numbersA) {
            for (Integer j : numbersB) {
                ArrayList<Integer> bigNumber = new ArrayList<>();
                if(i > j){
                    bigNumber.add(i);
                    bigNumber.add(j);
                    numbersR.add(bigNumber);
                }
            }
        }
        System.out.println(numbersR);
    }
}
