package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Bekisyugou {

    public static HashSet<HashSet<Integer>> power(Set<Integer> numbersS){
        HashSet<Integer> numbersSNull = new HashSet<>();
        HashSet<HashSet<Integer>> numbersSA = new HashSet<>(Set.of(numbersSNull));

        numbersSA.add(numbersSNull);

        for(int i = 0; i<numbersS.size(); i++){
            HashSet<HashSet<Integer>> numbersSAs = new HashSet<>();
            for(HashSet<Integer> numbersSF : numbersSA){
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
