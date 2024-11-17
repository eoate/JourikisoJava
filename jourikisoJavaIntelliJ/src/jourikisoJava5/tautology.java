package jourikisoJava5;

import static jourikisoJava5.Ganni.implication;

public class tautology {
    public static void main(String[] args){
        boolean[] tf = {true,false};
        boolean result = true;
        a:for(boolean i:tf){
            for(boolean j:tf){
                if(!implication(i, i||j)){
                    result = false;
                    break a;
                }
            }
        }
        if(result){
            System.out.println("恒真式です");
        } else {
            System.out.println("恒真式ではありません");
        }
    }
}
//入れる式によって答えが変わる。一つ目のif文の!を取り除き、print文の恒真式を恒偽式に変えることで恒偽式の判定に変えることができる
