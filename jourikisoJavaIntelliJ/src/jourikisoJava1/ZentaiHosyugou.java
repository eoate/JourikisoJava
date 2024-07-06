package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class ZentaiHosyugou {
    public static void main(String[] args) {
        //全体集合と補集合を実装する。全体集合をN_10とする
        HashSet<Integer> numbersSS = new HashSet<>(Set.of(0,1,2,3,4,5,6,7,8,9));
        HashSet<Integer> numbersSA = new HashSet<>(Set.of(1,3,5,7,9));
        HashSet<Integer> numbersSA_S = new HashSet<>();
        for(Integer i : numbersSS){
            if(!numbersSA.contains(i)){
                numbersSA_S.add(i);
            }
        }
        System.out.println(numbersSA_S); //出力:[0, 2, 4, 6, 8]
    }
}
