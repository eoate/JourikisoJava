package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Sinbubunsyugou {
    public static boolean isProperSubset(HashSet numbers, HashSet numbersSub) {
        return numbers.containsAll(numbersSub) && !numbers.equals(numbersSub);
    }

    public static void main(String[] args) {
        //真部分集合かどうかは定義と同様に、部分集合でかつ等しくないことかどうかを判定すればよい
        HashSet<Integer> numbersS = new HashSet<>(Set.of(1,2,3));
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(1,2,3));
        System.out.println(isProperSubset(numbersS, numbersS1)); //出力:true
        System.out.println(isProperSubset(numbersS, numbersS2)); //出力:false
    }
}
