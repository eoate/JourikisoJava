package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Bekisyugou {

    public static HashSet<Set<Integer>> power(Set<Integer> numbersS){
        HashSet<Integer> numbersSNull = new HashSet<>();
        HashSet<Set<Integer>> numbersSA = new HashSet<>(Set.of(numbersSNull));

        for(int i = 0; i<numbersS.size(); i++){
            HashSet<HashSet<Integer>> numbersSAs = new HashSet<>();
            for(Set<Integer> numbersSF : numbersSA){
                for(Integer number : numbersS){
                    HashSet<Integer> numbersSB = new HashSet<>(numbersSF);
                    numbersSB.add(number);
                    numbersSAs.add(numbersSB);
                }
            }
            numbersSA.addAll(numbersSAs);
        }
        return numbersSA;
    }

    public static void main(String[] args) {
        System.out.println(power(Set.of(1,2,3)));
        //出力:[[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]
    }
}
