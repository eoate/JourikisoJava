package jourikisoJava3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OyaKo {
    public static HashSet<List<Integer>> parentChild(HashSet<Integer> numbersA,HashSet<List<Integer>> numbersR){
        HashSet<List<Integer>> res = new HashSet<>();
        if(Hanjyunjotui.partialOrder(numbersA,numbersR)){
            a:for(List<Integer> list : numbersR){
                if(!list.getFirst().equals(list.get(1))) {
                    for (int x : numbersA) {
                        if (!list.contains(x) && numbersR.contains(Arrays.asList(list.getFirst(), x)) && numbersR.contains(Arrays.asList(x, list.get(1)))) continue a;
                    }
                    res.add(list);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbersA = new HashSet<>();
        HashSet<List<Integer>> numbersR = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            numbersA.add(i);
            for (int j = 1; j <= 20; j++) {
                if((j%i) == 0)numbersR.add(Arrays.asList(i,j));
            }
        }
        System.out.println(parentChild(numbersA,numbersR));
        //出力:[[2, 4], [2, 6], [4, 8], [6, 12], [2, 10], [4, 12], [8, 16], [10, 20], [2, 14], [6, 18], [4, 20], [1, 2], [1, 3], [3, 6], [1, 5], [5, 10], [3, 9], [1, 7], [7, 14], [9, 18], [1, 11], [5, 15], [3, 15], [1, 13], [1, 17], [1, 19]]
    }
}
