package jourikisoJava3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Hanjyunjotui {
    public static boolean partialOrder(HashSet<Integer> numbersA,HashSet<List<Integer>> numbersR){
        return Hansyaritu.isReflective(numbersA,numbersR)
                &&Hantaisyouritu.isAntiSymmetry(numbersR)
                &&Suiiritu.isTransitivity(numbersR);
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
        System.out.println(partialOrder(numbersA,numbersR));
        //出力:true
    }
}
