package jourikisoJava5;

public class Meidai {
    public static boolean prop(int x){
        return x == 2;
    }
    public static void main(String[] args){
        int x;
        x = 2;
        System.out.println("x=" + x + "のとき命題「xは2である」は" + prop(x));
        x = 1;
        System.out.println("x=" + x + "のとき命題「xは2である」は" + prop(x));
    }
}
