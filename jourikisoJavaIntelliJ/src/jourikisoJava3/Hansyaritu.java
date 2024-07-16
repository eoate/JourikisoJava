package jourikisoJava3;

import java.util.*;

public class Hansyaritu {
    public static boolean isReflective(HashSet<Integer> numbersA,HashSet<List<Integer>> numbersR){
        HashSet<List<Integer>> numbersAA = new HashSet<>();
        for(Integer i : numbersA){
            numbersAA.add(Arrays.asList(i,i));
        }
        return numbersR.containsAll(numbersAA);
    }
    public static void main(String[] args) {
        HashSet<Integer> numbersA = new HashSet<>(Set.of(1,5,6));
        HashSet<List<Integer>> numbersR1 = new HashSet<>(Set.of(Arrays.asList(1,1),Arrays.asList(1,5),Arrays.asList(5,5),Arrays.asList(6,1),Arrays.asList(6,6)));
        HashSet<List<Integer>> numbersR2 = new HashSet<>(Set.of(Arrays.asList(1,1),Arrays.asList(1,6),Arrays.asList(5,6),Arrays.asList(6,1)));
        System.out.println(isReflective(numbersA,numbersR1)); //出力:true
        System.out.println(isReflective(numbersA,numbersR2)); //出力:false
    }
}
