package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class ZentaiHosyugou {
    public static HashSet<Integer> complement(HashSet<Integer> numbersU, HashSet<Integer> numbersC) {
        HashSet<Integer> numbersU_C = new HashSet<>();
        for(Integer i : numbersU){
            if(!numbersC.contains(i)){
                numbersU_C.add(i);
            }
        }
        return numbersU_C;
    }

    public static void main(String[] args) {
        //全体集合と補集合を実装する。全体集合をN_10とする
        HashSet<Integer> numbersU = new HashSet<>(Set.of(0,1,2,3,4,5,6,7,8,9));
        HashSet<Integer> numbersC = new HashSet<>(Set.of(1,3,5,7,9));
        System.out.println(complement(numbersU, numbersC)); //出力:[0, 2, 4, 6, 8]
    }
}
