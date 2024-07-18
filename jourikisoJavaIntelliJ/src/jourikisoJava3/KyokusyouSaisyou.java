package jourikisoJava3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KyokusyouSaisyou {
    public static int minimum(HashSet<Integer> numbersA, HashSet<Integer> numbersB, HashSet<List<Integer>> numbersR, boolean um){
        if(!(Hanjyunjotui.partialOrder(numbersA, numbersR) && numbersA.containsAll(numbersB)))return Integer.MAX_VALUE;
        int minimum = Integer.MAX_VALUE;
        int count = 0;
        a:for(int num : numbersB){
            for(List<Integer> list : numbersR){
                if(list.get(1).equals(num) && numbersB.contains(list.getFirst()) && !list.getFirst().equals(list.get(1)))continue a;
                if(um && list.getFirst().equals(num) && numbersB.contains(list.get(1)) && !list.get(1).equals(num))count++;
            }
            if(count == numbersB.size()-1 && um){
                minimum = num;
                break;
            }else if(!um){
                minimum = num;
                break;
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbersA = new HashSet<>();
        HashSet<Integer> numbersB = new HashSet<>(Set.of(3));
        HashSet<List<Integer>> numbersR = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            numbersA.add(i);
            for (int j = 1; j <= 20; j++) {
                if(i <= j)numbersR.add(Arrays.asList(i,j));
            }
        }
        System.out.println(minimum(numbersA, numbersB, numbersR, true));
        System.out.println(minimum(numbersA, numbersB, numbersR, false));
    }
}
