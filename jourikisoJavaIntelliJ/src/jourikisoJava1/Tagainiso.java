package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Tagainiso {
    public static void main(String[] args) {
        //共通部分集合の要素数が0であれば元の集合は互いに素である。
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,3,5,7,9));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(2,4,6,8));
        HashSet<Integer> numbersS12 = new HashSet<>();
        for (Integer i : numbersS1) {
            if (numbersS2.contains(i)) {
                numbersS12.add(i);
            }
        }
        if(numbersS12.isEmpty()){
            System.out.println("numbersS1とnumbersS2は互いに素です");
        }else{
            System.out.println("numbersS1とnumbersS2は互いに素ではありません");
        }
        //出力:numbersS1とnumbersS2は互いに素です
    }
}
