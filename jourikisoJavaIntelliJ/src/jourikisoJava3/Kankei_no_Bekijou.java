package jourikisoJava3;

import java.util.*;

public class Kankei_no_Bekijou {
    public static HashSet<List<Integer>> R(HashSet<Integer> numbersA, HashSet<List<Integer>> numbersB, int n){
        if(n == 0) {
            HashSet<List<Integer>> res = new HashSet<>();
            for(int num : numbersA){
                List<Integer> list = new ArrayList<>();
                list.add(num);
                list.add(num);
                res.add(list);
            }
            return res;
        }else if(n == 1) {
            return numbersB;
        }else {
            HashSet<List<Integer>> res = new HashSet<>();
            HashSet<List<Integer>> resB = new HashSet<>(numbersB);
            for(int i = 0; i<n-1; i++) {
                for (List<Integer> listB : resB) {
                    for (List<Integer> list : numbersB) {
                        List<Integer> temp = new ArrayList<>();
                        if (listB.get(1).equals(list.getFirst())) {
                            temp.add(listB.getFirst());
                            temp.add(list.get(1));
                            res.add(temp);
                        }
                    }
                }
            }
            return res;
        }
    }
    public static void main(String[] args) {
        HashSet<List<Integer>> numbersB = new HashSet<>(Set.of(Arrays.asList(0,2),Arrays.asList(1,2),Arrays.asList(2,3)));
        HashSet<Integer> numbersA = new HashSet<>(Set.of(0,1,2,3));

        System.out.println(R(numbersA, numbersB, 0));
        System.out.println(R(numbersA, numbersB, 1));
        System.out.println(R(numbersA, numbersB, 2));
    }
}
