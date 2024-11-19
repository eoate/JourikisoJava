package jourikisoJava6;

public class factorial {
    public static int factorial(int num){
        int result = 1;
        for(int i=1; i<=num;i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(factorial(7));
    }
}
