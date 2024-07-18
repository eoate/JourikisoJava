package jourikisoJava3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Zenjunjokankei {
    public static boolean totalOrder(HashSet<Integer> numbersA, HashSet<List<Integer>> numbersR){
        boolean res = true;
        a:for(int i : numbersA){
            for(int j : numbersA){
                if(!numbersR.contains(Arrays.asList(i,j)) && !numbersR.contains(Arrays.asList(j,i))){
                    res = false;
                    break a;
                }
            }
        }
        return Hanjyunjotui.partialOrder(numbersA,numbersR) && res;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbersA = new HashSet<>();
        HashSet<List<Integer>> numbersR = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numbersA.add(i);
            for (int j = 1; j <= 10; j++) {
                if(j <= i)numbersR.add(Arrays.asList(i,j));
            }
        }
        System.out.println(totalOrder(numbersA,numbersR));
        //出力:true
    }
}
