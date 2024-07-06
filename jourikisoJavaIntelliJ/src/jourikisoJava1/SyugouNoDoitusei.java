package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class SyugouNoDoitusei {
    public static void main(String[] args) {
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(1,2));
        HashSet<Integer> numbersS3 = new HashSet<>(Set.of(2,3));
        if(numbersS2.equals(numbersS1)){
            System.out.println("numbers1とnumbers2は等しい");
        }else {
            System.out.println("numbers1とnumbers2は等しくない");
        }
        if(numbersS3.equals(numbersS1)){
            System.out.println("numbers1とnumbersは3等しい");
        }else {
            System.out.println("numbers1とnumbers3は等しくない");
        }
        /*出力:numbers1とnumbers2は等しい
          　　 numbers1とnumbers3は等しくない*/
    }
}
