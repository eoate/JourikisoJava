package jourikisoJava6;

import java.util.ArrayList;
import java.util.Collections;

public class divisorEtc {
    //約数
    public static ArrayList<Integer> divisor(int num){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num%i==0){
                result.add(i);
                result.add(num/i);
            }
        }
        Collections.sort(result);
        return result;
    }
    //素因数分解
    public static ArrayList<Integer> factorization(int num){
        ArrayList<Integer> result = new ArrayList<>();
        int min = 2;
        while(num!=1) {
            for (int i = min; i <= num; i++){
                if(num%i==0){
                    result.add(i);
                    num /= i;
                    break;
                }
            }
        }
        return result;
    }
    //素数
    public static boolean isPrimeNumber(int num){
        return factorization(num).size() == 1;
    }
    //素因数
    public static ArrayList<Integer> primeFactor(int num){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i:factorization(num)){
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    //最大公約数
    public static int greatestCommonDivisor(int a,int b){
        ArrayList<Integer> facA = divisor(a);
        ArrayList<Integer> facB = divisor(  b);
        int result = 1;
        for(int i:facA){
            if(facB.contains(i) && result < i){
                result = i;
            }
        }
        return result;
    }
    //互いに素
    public static boolean coprime(int a,int b){
        return greatestCommonDivisor(a,b) == 1;
    }

    public static void main(String[] args){
        System.out.println(divisor(96));
        System.out.println(factorization(96));
        System.out.println(isPrimeNumber(96));
        System.out.println(primeFactor(96));
        System.out.println(greatestCommonDivisor(24,510));
        System.out.println(coprime(49,81));
    }
}
