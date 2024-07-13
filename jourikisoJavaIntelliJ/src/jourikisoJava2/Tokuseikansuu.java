package jourikisoJava2;

import java.util.HashSet;
import java.util.Set;

public class Tokuseikansuu {
    public static void main(String[] args) {
        HashSet<Integer> numbersS = new HashSet<>(Set.of(1,2,3,4,5));
        HashSet<Integer> numbersA = new HashSet<>(Set.of(1,3,5));
        for (Integer number : numbersS) {
            System.out.print("X_A(" + number + ")=");
            if(numbersA.contains(number)) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        } /*出力:X_A(1)=1
                X_A(2)=0
                X_A(3)=1
                X_A(4)=0
                X_A(5)=1 */
    }
}
