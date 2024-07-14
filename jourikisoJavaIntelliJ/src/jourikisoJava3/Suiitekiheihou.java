package jourikisoJava3;

import java.util.*;

public class Suiitekiheihou {
    public static HashSet<List<Integer>> R(HashSet<Integer> numbersA, HashSet<List<Integer>> numbersB, boolean ref) {
        HashSet<List<Integer>> res = new HashSet<>();
        if(ref) {
            for (int num : numbersA) {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                list.add(num);
                res.add(list);
            }
        }
        res.addAll(numbersB);
        HashSet<List<Integer>> resB = new HashSet<>(numbersB);
        while (!resB.isEmpty()) {
            HashSet<List<Integer>> resC = new HashSet<>();
            for (List<Integer> listB : resB) {
                for (List<Integer> list : numbersB) {
                    List<Integer> temp = new ArrayList<>();
                    if (listB.get(1).equals(list.getFirst())) {
                        temp.add(listB.getFirst());
                        temp.add(list.get(1));
                        res.add(temp);
                        resC.add(temp);
                    }
                }
            }
            resB.clear();
            resB.addAll(resC);
        }
        return res;
    }
    public static void main(String[] args) {
        HashSet<Integer> numbersA = new HashSet<>(Set.of(0,1,2,3));
        HashSet<List<Integer>> numbersB = new HashSet<>(Set.of(Arrays.asList(0,2),Arrays.asList(1,2),Arrays.asList(2,3)));
        boolean ref = false;
        System.out.println(R(numbersA, numbersB, ref));
    }
}
