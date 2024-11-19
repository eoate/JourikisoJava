package jourikisoJava5;

public class SinritiHenkan {
    public static boolean truthValue(int n){
        if(n==0)return false;
        if (n==1)return true;
        System.out.println("error");
        return false;
    }
    public static int truthValueNumber(boolean x){
        if(x)return 1;
        return 0;
    }

    public static void main(String[] args){
        System.out.println(truthValue(1)); //出力:true
        System.out.println(truthValueNumber(false)); //出力:0
    }
}
