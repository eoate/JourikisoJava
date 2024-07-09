package jourikisoJava2;

public class BoolKansuu {
    //ブール関数の例として論理和、論理積、否定を実装する
    public static boolean w(boolean x, boolean y){
        return x || y;
    }
    public static boolean s(boolean x, boolean y){
        return x && y;
    }
    public static boolean n(boolean x){
        return !x;
    }
    public static void main(String[] args) {
        System.out.println(w(true, false)); //出力:true
        System.out.println(s(true, false)); //出力:false
        System.out.println(n(true)); //出力:false
    }
}
