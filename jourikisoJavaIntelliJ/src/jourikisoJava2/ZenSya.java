package jourikisoJava2;

import java.util.HashSet;

public class ZenSya {
    //fの定義域をN_2,値域を1,2,3,gの定義域をN_2,値域をN_4とおく
    public static int f(int n){
        return n+1;
    }
    public static int g(int n){
        return n*n;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers_f = new HashSet<>();
        HashSet<Integer> numbers_g = new HashSet<>();
        for(int i=0;i<=2;i++){
            numbers_f.add(f(i));
            numbers_g.add(g(i));
        }
        if(numbers_f.size() == 3){
            System.out.println("fは全射です");
        }else{
            System.out.println("fは全射ではありません");
        } //出力:fは全射です
        if(numbers_g.size() == 5){
            System.out.println("gは全射です");
        }else{
            System.out.println("gは全射ではありません");
        } //出力:gは全射ではありません
    }
}
