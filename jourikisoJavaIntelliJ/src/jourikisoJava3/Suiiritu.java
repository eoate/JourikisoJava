package jourikisoJava3;

import java.util.*;

public class Suiiritu {
    public static boolean isTransitivity(HashSet<List<Integer>> numbersR){
        for(List<Integer> list : numbersR){
            for(List<Integer> list2 : numbersR){
                if(list.get(1).equals(list2.getFirst())){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(list.getFirst(), list2.get(1)));
                    if(!numbersR.contains(temp)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        HashSet<List<Integer>> numbersR1 = new HashSet<>(Set.of(Arrays.asList(1,2),Arrays.asList(2,1),Arrays.asList(1,1),Arrays.asList(2,2)));
        HashSet<List<Integer>> numbersR2 = new HashSet<>(Set.of(Arrays.asList(1,2),Arrays.asList(2,1),Arrays.asList(5,6),Arrays.asList(6,5)));
        System.out.println(isTransitivity(numbersR1));
        System.out.println(isTransitivity(numbersR2));
    }
}
