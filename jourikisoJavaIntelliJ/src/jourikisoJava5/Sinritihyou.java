package jourikisoJava5;

public class Sinritihyou {
    public static boolean truthValue(int n){
        if(n==0)return false;
        if (n==1)return true;
        System.out.println("error");
        return false;
    }

    public static int truthValueNumber(boolean x){
        if(x)return 1;
        if(!x)return 0;
        System.out.println("error");
        return 9999;
    }

    public static void main(String[] args){
        System.out.println("a b |a∧b");
        for(int a = 0; a<=1; a++){
            for(int b=0; b<=1; b++){
                System.out.println(a + " " + b + " | " + truthValueNumber(truthValue(a) && truthValue(b)));
            }
        }
    }
}
