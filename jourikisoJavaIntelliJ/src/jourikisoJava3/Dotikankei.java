package jourikisoJava3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Dotikankei {
    public static boolean equivalenceRelation(HashSet<Integer> numbersA, HashSet<List<Integer>> numbersR){
        return Hansyaritu.isReflective(numbersA, numbersR)
                &&Taisyouritu.isSymmetry(numbersR)
                &&Suiiritu.isTransitivity(numbersR);
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
        System.out.println(equivalenceRelation(numbersA, numbersR));
        //出力:true
    }
}
