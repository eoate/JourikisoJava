package jourikisoJava1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TyokusekiSyugou {
    public static HashSet<ArrayList<Integer>> directProduct(HashSet<Integer> numbers1, HashSet<Integer> numbers2) {
        HashSet<ArrayList<Integer>> numbers12 = new HashSet<>();
        for(int x : numbers1){
            for(int y : numbers2){
                ArrayList<Integer> numbersS = new ArrayList<>();
                numbersS.add(x);
                numbersS.add(y);
                numbers12.add(numbersS);
            }
        }
        return numbers12;
    }

    public static void main(String[] args) {
        //直積集合numbersS1×numbersS2を実装する
        HashSet<Integer> numbers1 = new HashSet<>(Set.of(1,2));
        HashSet<Integer> numbers2 = new HashSet<>(Set.of(2,3));
        System.out.println(directProduct(numbers1, numbers2));
        //出力:[[2, 2], [1, 2], [2, 3], [1, 3]]
    }
}
