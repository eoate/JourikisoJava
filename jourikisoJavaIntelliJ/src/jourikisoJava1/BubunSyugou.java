package jourikisoJava1;
import java.util.HashSet;
import java.util.Set;

public class BubunSyugou {
    public static void main(String[] args) {
        //部分集合かどうかは集合の要素すべてについて元の集合に含まれているかどうかで判定できる。
        HashSet<Integer> numbersS = new HashSet<>(Set.of(1,2,3,4));
        HashSet<Integer> numbersSb1 = new HashSet<>(Set.of(1,2,3));
        HashSet<Integer> numbersSb2 = new HashSet<>(Set.of(1,5));
        System.out.println(numbersS.containsAll(numbersSb1)); //出力:true
        System.out.println(numbersS.containsAll(numbersSb2)); //出力:false
    }
}
