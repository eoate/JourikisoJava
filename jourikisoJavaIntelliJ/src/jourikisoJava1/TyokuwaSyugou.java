package jourikisoJava1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TyokuwaSyugou {
    public static HashSet<ArrayList<Integer>> directSum(HashSet<Integer> numbers1, HashSet<Integer> numbers2){
        HashSet<ArrayList<Integer>> numbers12 = new HashSet<>();
        for(Integer i : numbers1){
            ArrayList<Integer> numbersS = new ArrayList<>();
            numbersS.add(i);
            numbersS.add(0);
            numbers12.add(numbersS);
        }
        for(Integer i : numbers2){
            ArrayList<Integer> numbersS = new ArrayList<>();
            numbersS.add(i);
            numbersS.add(1);
            numbers12.add(numbersS);
        }
        return numbers12;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers1 = new HashSet<>(Set.of(1,2,3));
        HashSet<Integer> numbers2 = new HashSet<>(Set.of(2,4,6));

        System.out.println(directSum(numbers1, numbers2));
        //出力:[[1, 0], [2, 1], [6, 1], [3, 0], [4, 1], [2, 0]]
    }
}
