package jourikisoJava1;
import java.util.HashSet;
import java.util.Set;

public class BubunSyugou {
    public static void main(String[] args) {
        //部分集合は、元の集合の要素の一部を新たな集合に入れることで実装できそう。->Setの一部を取り出せない？
        //部分集合かどうかは集合の要素すべてについて元の集合に含まれているかどうかで判定できる。
        HashSet<Integer> numbersS = new HashSet<>(Set.of(1,2,3,4));
        HashSet<Integer> numbersSb1 = new HashSet<>(Set.of(1,2,3));
        HashSet<Integer> numbersSb2 = new HashSet<>(Set.of(1,5));
        if(numbersS.containsAll(numbersSb1)){
            System.out.println("numbersSb1はnumbersSの部分集合です");
        }else{
            System.out.println("numbersSb1はnumbersSの部分集合ではありません");
        }

        if(numbersS.containsAll(numbersSb2)){
            System.out.println("numbersSb2はnumbersSの部分集合です");
        }else{
            System.out.println("numbersSb2はnumbersSの部分集合ではありません");
        }
        /*出力:numbersSb1はnumbersSの部分集合です
          　   numbersSb2はnumbersSの部分集合ではありません*/
    }
}
