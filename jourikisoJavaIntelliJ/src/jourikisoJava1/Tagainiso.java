package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;


public class Tagainiso {
    public static boolean isDisjoint(HashSet<Integer> numbers1, HashSet<Integer> numbers2){
        HashSet<Integer> numbers12 = KyotuBubunSyugou.intersection(numbers1, numbers2);
        return (numbers12.isEmpty());
    }
    public static void main(String[] args) {
        //共通部分集合の要素数が0であれば元の集合は互いに素である。
        HashSet<Integer> numbers1 = new HashSet<>(Set.of(1,3,5,7,9));
        HashSet<Integer> numbers2 = new HashSet<>(Set.of(2,4,6,8));
        System.out.println(isDisjoint(numbers1, numbers2)); //出力:true
    }
}
