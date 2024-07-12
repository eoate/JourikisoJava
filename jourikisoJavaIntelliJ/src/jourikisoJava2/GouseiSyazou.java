package jourikisoJava2;

public class GouseiSyazou {

    public static int f(int n){
        return 2*n+1;
    }

    public static int g(int n){
        return 2*n;
    }

    public static void main(String[] args) {
        System.out.println("fg(2)=" + f(g(2))); //出力:fg(2)=9
        System.out.println("gf(2)=" + g(f(2))); //出力:gf(2)=10
    }
}
