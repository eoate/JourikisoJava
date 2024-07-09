package jourikisoJava2;

public class Tahensukansu {
    //多変数関数も同様に実装できる
    public static int f(int x,int y,int z){
        return x*y-z;
    }
    public static void main(String[] args) {
        System.out.println("f(5,3,4)=" + f(5,3,4));//出力:f(5,3,4)=11
    }
}
