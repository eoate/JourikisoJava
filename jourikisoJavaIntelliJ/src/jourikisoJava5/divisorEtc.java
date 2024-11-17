package jourikisoJava5;

import java.util.ArrayList;

public class divisorEtc {
    public static ArrayList<Integer> factorization(int num){
        ArrayList<Integer> factors = new ArrayList<>();
        int min = 2;
        while(num!=1) {
            for (int i = min; i <= num; i++){
                if(num%i==0){
                    factors.add(i);
                    num /= i;
                    break;
                }
            }
        }
        return factors;
    }
    public static

    public static void main(String[] args){
        System.out.println(factorization(96));
    }
}
