package jourikisoJava3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Dotirui {
    public static HashSet<Integer> equivalenceClass(HashSet<Integer> numbersA, HashSet<List<Integer>> numbersR, int n){
       HashSet<Integer> result = new HashSet<>();
       if(!Dotikankei.equivalenceRelation(numbersA, numbersR))return result;
       if(!numbersA.contains(n))return result;
       for(List<Integer> list : numbersR){
           if(list.getFirst() == n)result.add(list.get(1));
       }
       return result;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbersA = new HashSet<>();
        HashSet<List<Integer>> numbersR = new HashSet<>();
        for (int i = 0; i <= 20; i++) {
            numbersA.add(i);
            for (int j = 0; j <= 20; j++) {
                if(i%4 == j%4)numbersR.add(Arrays.asList(i,j));
            }
        }
        System.out.println(equivalenceClass(numbersA, numbersR, 5)); //出力:[1, 17, 5, 9, 13]
        System.out.println(equivalenceClass(numbersA, numbersR, 6)); //出力:[2, 18, 6, 10, 14]
    }
}
