package jourikisoJava5;

import java.util.Arrays;

public class Adder {
    public static boolean[] semiAdder(boolean a,boolean b){
        boolean data[] = new boolean[2];
        boolean l = a && b;
        data[0] = (a || b) && !l;
        data[1] = l;
        return data;
    }
    public static int[] fullAdder(){

    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(semiAdder(true, false)));
    }
}
