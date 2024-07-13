package jourikisoJava3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Kankei_no_Doitusi {
    //A,Bについて関係>と>=が等しいかどうか判定する関数を実装する
    public static String AB(Set<Integer> numbersA, Set<Integer> numbersB){
        HashSet<ArrayList<Integer>> numbersR = new HashSet<>();
        HashSet<ArrayList<Integer>> numbersRe = new HashSet<>();
        for (Integer i : numbersA) {
            for (Integer j : numbersB) {
                ArrayList<Integer> bigNumber = new ArrayList<>();
                if(i > j){
                    bigNumber.add(i);
                    bigNumber.add(j);
                    numbersR.add(bigNumber);
                }
            }
        }
        for (Integer i : numbersA) {
            for (Integer j : numbersB) {
                ArrayList<Integer> bigNumber = new ArrayList<>();
                if(i >= j){
                    bigNumber.add(i);
                    bigNumber.add(j);
                    numbersRe.add(bigNumber);
                }
            }
        }

        if(numbersR.equals(numbersRe)){
            return"等しい";
        }else{
            return"等しくない";
        }
    }

    public static void main(String[] args) {
        System.out.println(AB(Set.of(1,3,5,6),Set.of(2,4,7,8))); //出力:等しい
        System.out.println(AB(Set.of(1,2,3,4),Set.of(3,4,5,6))); //出力:等しくない

    }
}
