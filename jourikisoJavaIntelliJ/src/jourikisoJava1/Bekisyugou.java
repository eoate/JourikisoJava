package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Bekisyugou {
    public static void main(String[] args) {
        HashSet<Integer> numbersS = new HashSet<>(Set.of(1,2,3,4));
        HashSet<HashSet> numbersSNull = new HashSet<>();
        HashSet<HashSet> numbersSB = new HashSet<>();
        HashSet<Integer> numbersSA = new HashSet<>();
        numbersSB.add(numbersSNull);
        for(int i = 1; i <= numbersS.size(); i++) {
            for(HashSet numbersSF : numbersSB){
                for(Integer n : numbersS) {
                    numbersSA.clear();
                    numbersSA.addAll(numbersSF);
                    numbersSA.add(n);
                    System.out.print(numbersSA);
                    numbersSB.add(numbersSA);
                }
            }   
        }
        System.out.println(numbersSB);
    }
}
