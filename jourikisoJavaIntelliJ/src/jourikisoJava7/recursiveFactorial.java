package jourikisoJava7;

public class recursiveFactorial {
    public static int reFactorial(int num){
        if(num==0)return 1;
        return reFactorial(num-1)*num;
    }
    public static void main(String[] args){
        System.out.println(reFactorial(7));
    }
}
