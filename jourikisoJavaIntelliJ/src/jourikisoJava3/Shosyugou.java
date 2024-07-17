package jourikisoJava3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Shosyugou {
    public static HashSet<HashSet<Integer>> quotientSet(HashSet<Integer> numbersA, HashSet<List<Integer>> numbersR) {
        HashSet<HashSet<Integer>> result = new HashSet<>();
        if(!Dotikankei.equivalenceRelation(numbersA, numbersR))return result;
        HashSet<Integer> temp = new HashSet<>();
        for(Integer i : numbersA) {
            if(!temp.contains(i)) {
                HashSet<Integer> temp1 = new HashSet<>();
                for (List<Integer> list : numbersR) {
                    if (list.getFirst().equals(i)){
                        temp1.add(list.get(1));
                        temp.add(list.get(1));
                    }
                }
                result.add(temp1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbersA = new HashSet<>();
        HashSet<List<Integer>> numbersR = new HashSet<>();
        for (int i = 0; i <= 20; i++) {
            numbersA.add(i);
            for (int j = 0; j <= 20; j++) {
                if(i%3 == j%3)numbersR.add(Arrays.asList(i,j));
            }
        }
        System.out.println(quotientSet(numbersA, numbersR));
        //出力:[[16, 1, 19, 4, 7, 10, 13], [17, 2, 20, 5, 8, 11, 14], [0, 18, 3, 6, 9, 12, 15]]
    }
}
