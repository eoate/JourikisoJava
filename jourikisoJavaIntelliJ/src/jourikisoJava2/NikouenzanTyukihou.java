package jourikisoJava2;

public class NikouenzanTyukihou {
    //javaで標準実装されている二項演算子の例として、四則演算子や剰余演算子を挙げる。
    public static void main(String[] args) {
        System.out.println(1+1); //出力:2
        System.out.println(2-1); //出力:1
        System.out.println(3*2); //出力:6
        System.out.println(4/2); //出力:2
        System.out.println(5%3); //出力:2
        //割り算において、int型の数値どうしの計算を行うと小数点以下は切り捨てされる
        System.out.println(8/3); //出力:2
        //数値の後ろにfをつけるとfloat型となり小数点以下も一部計算される
        System.out.println(8f/3f); //出力:2.6666667
    }
}
