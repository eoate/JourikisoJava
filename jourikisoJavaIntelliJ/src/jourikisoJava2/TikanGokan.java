package jourikisoJava2;

import java.util.HashMap;

public class TikanGokan {
    public static void main(String[] args) {
        //HashMapクラスを用いて置換を実装する。
        HashMap<Integer,Integer> numbersAB = new HashMap<>();
        numbersAB.put(0,1);
        numbersAB.put(1,0);
        numbersAB.put(2,2);
        numbersAB.put(3,3);
        for(int i=0; i<=3; i++) {
            System.out.println(i + "→" + numbersAB.get(i));
        } /*出力: 0→1
                 1→0
                 2→2
                 3→3*/
        //for文を用いて互換であるかどうかを判定する
        int count = 0;
        for(int i : numbersAB.keySet()) {
            if(numbersAB.get(i) != i) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println("互換です");
        }else{
            System.out.println("互換ではありません");
        } //出力:互換です
    }
}
