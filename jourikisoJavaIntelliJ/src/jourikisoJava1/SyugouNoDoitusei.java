package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class SyugouNoDoitusei {
    public static void main(String[] args) {
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(1,2));
        HashSet<Integer> numbersS3 = new HashSet<>(Set.of(2,3));
        System.out.println(numbersS2.equals(numbersS1)); //出力:true
        System.out.println(numbersS3.equals(numbersS1)); //出力:false
    }
}
