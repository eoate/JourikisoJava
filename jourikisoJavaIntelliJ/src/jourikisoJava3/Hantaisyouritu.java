package jourikisoJava3;

import java.util.*;

public class Hantaisyouritu {
    public static boolean isAntiSymmetry(HashSet<List<Integer>> numbersR){
        for(List<Integer> list : numbersR){
            if(!list.getFirst().equals(list.get(1))){
                List<Integer> temp = new ArrayList<>(Arrays.asList(list.get(1),list.getFirst()));
                if(numbersR.contains(temp)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        HashSet<List<Integer>> numbersR1 = new HashSet<>(Set.of(Arrays.asList(1,1),Arrays.asList(2,1),Arrays.asList(2,2),Arrays.asList(6,6)));
        HashSet<List<Integer>> numbersR2 = new HashSet<>(Set.of(Arrays.asList(1,1),Arrays.asList(2,1),Arrays.asList(1,2),Arrays.asList(6,6)));
        System.out.println(isAntiSymmetry(numbersR1)); //出力:true
        System.out.println(isAntiSymmetry(numbersR2)); //出力:false
    }
}
