package jourikisoJava1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TyokusekiSyugou {
    public static void main(String[] args) {
        //直積集合numbersS1×numbersS2を実装する
        HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,3,5,7,9));
        HashSet<Integer> numbersS2 = new HashSet<>(Set.of(2,4,6,8));
        HashSet<ArrayList> numbersS12 = new HashSet<>();
        ArrayList<Integer> numbersS = new ArrayList<>();
        for(int x : numbersS1){
            for(int y : numbersS2){
                numbersS.clear();
                numbersS.add(x);
                numbersS.add(y);
                numbersS12.add(numbersS);
            }
        }
        System.out.println(numbersS12);
        System.out.println("これはバグかな？");
    }
}
