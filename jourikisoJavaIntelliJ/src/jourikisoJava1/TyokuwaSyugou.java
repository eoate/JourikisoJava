package jourikisoJava1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TyokuwaSyugou {
    public static void main(String[] args) {
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2,3));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(2,4,6));
        HashSet<ArrayList<Integer>> numbersS12 = new HashSet<>();
        for(Integer i : numbersS1){
            ArrayList<Integer> numbersS = new ArrayList<>();
            numbersS.add(i);
            numbersS.add(0);
            numbersS12.add(numbersS);
        }
        for(Integer i : numbersS2){
            ArrayList<Integer> numbersS = new ArrayList<>();
            numbersS.add(i);
            numbersS.add(1);
            numbersS12.add(numbersS);
        }
        System.out.println(numbersS12);
    }
}
