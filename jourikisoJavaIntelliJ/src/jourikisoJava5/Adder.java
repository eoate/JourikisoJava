package jourikisoJava5;

import java.util.Arrays;

public class Adder {
    public static boolean[] semiAdder(boolean a,boolean b){
        boolean[] data = new boolean[2];
        boolean l = a && b;
        data[0] = (a || b) && !l;
        data[1] = l;
        return data;
    }
    public static boolean[] fullAdder(boolean a,boolean b, boolean x){
        boolean[] semiA = semiAdder(a,b);
        boolean[] semiB = semiAdder(semiA[0], x);
        boolean[] data = new boolean[2];
        data[0] = semiB[0];
        data[1] = semiA[1] || semiB[1];
        return data;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(semiAdder(true, false)));
        System.out.println(Arrays.toString(fullAdder(true, true,true)));
    }
}
