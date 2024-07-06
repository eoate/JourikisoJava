package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Sinbubunsyugou {
    public static void main(String[] args) {
        //真部分集合かどうかは定義と同様に、部分集合でかつ等しくないことかどうかを判定すればよい
        HashSet<Integer> numbersS = new HashSet<>(Set.of(1,2,3));
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(1,2,3));
        if(numbersS.containsAll(numbersS1) && !numbersS1.equals(numbersS)){
            System.out.println("numbersS1はnumbersSの真部分集合");
        }else{
            System.out.println("numbersS1はnumbersSの真部分集合ではない");
        }
        if(numbersS.containsAll(numbersS2) && !numbersS2.equals(numbersS)){
            System.out.println("numbersS2はnumbersSの真部分集合");
        }else{
            System.out.println("numbersS2はnumbersSの真部分集合ではない");
        }
        /*出力:numbersS1はnumbersSの真部分集合
              numbersS2はnumbersSの真部分集合ではない*/
    }
}
