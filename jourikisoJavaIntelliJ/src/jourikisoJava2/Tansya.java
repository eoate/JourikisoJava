package jourikisoJava2;

import java.util.HashSet;

public class Tansya {
    //f,gの定義域を-3<=n<=3を満たす整数として単射性かどうかを判定する
    public static int f(int n){
        return n*(n+10);
    }
    public static int g(int n){
        return n*(n+1);
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers_f = new HashSet<>();
        HashSet<Integer> numbers_g = new HashSet<>();
        for(int i=-3;i<=3;i++){
            numbers_f.add(f(i));
            numbers_g.add(g(i));
        }
        if(numbers_f.size() == 7){
            System.out.println("fは単射です");
        }else{
            System.out.println("fは単射ではありません");
        } //出力:fは単射です
        if(numbers_g.size() == 7){
            System.out.println("gは単射です");
        }else{
            System.out.println("gは単射ではありません");
        } //出力:gは単射ではありません
    }
}
