package jourikisoJava3;

import java.util.*;

public class Seiretu {
    public static boolean wellOrdered(HashSet<Integer> numbersA, HashSet<List<Integer>> numbersR) {
        HashSet<Set<Integer>> setsA = new HashSet<>(jourikisoJava1.Bekisyugou.power(numbersA));
        ArrayList<Integer> temp = new ArrayList<>();
        for (Set<Integer> set : setsA) {
            HashSet<Integer> numbersB = new HashSet<>(set);
            if(!numbersB.isEmpty())temp.add(KyokusyouSaisyou.minimum(numbersA, numbersB, numbersR, true));
        }
        return temp.size() == setsA.size()-1 && !temp.contains(Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        HashSet<Integer> numbersA = new HashSet<>();
        HashSet<List<Integer>> numbersR = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            numbersA.add(i);
            for (int j = 1; j <= 5; j++) {
                if(i <= j)numbersR.add(Arrays.asList(i,j));
            }
        }
        System.out.println(wellOrdered(numbersA, numbersR));
    }
}
