package jourikisoJava8;

import java.util.ArrayList;
import java.util.Arrays;

public class euclidAlgorithm {
    public static int euclid(int a, int b){
        ArrayList<Integer> r = new ArrayList<>(Arrays.asList(a,b));
        int k=0;
        while(r.get(k+1) != 0){
            r.add(r.get(k) % r.get(k+1));
            k++;
        }
        return r.get(k);
    }
    public static void main(String[] args){
        System.out.println(euclid(1695,1440));
    }
}
