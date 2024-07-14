package jourikisoJava3;

import java.util.*;

public class hansyaritu {
    public static boolean isReflective(HashSet<List<Integer>> numbersR){
        HashSet<Integer> isUsed = new HashSet<>();
        a:for(List<Integer> list : numbersR){
            if(!isUsed.contains(list.getFirst())){
                isUsed.add(list.getFirst());
                for(List<Integer> list2 : numbersR){
                    if(list.getFirst().equals(list2.get(1))){
                        continue a;
                    }
                }
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        HashSet<List<Integer>> numbersR1 = new HashSet<>(Set.of(Arrays.asList(1,1),Arrays.asList(1,3),Arrays.asList(5,5),Arrays.asList(6,4),Arrays.asList(6,6)));
        HashSet<List<Integer>> numbersR2 = new HashSet<>(Set.of(Arrays.asList(1,2),Arrays.asList(1,3)));
        System.out.println(isReflective(numbersR1));
        System.out.println(isReflective(numbersR2));
    }
}
