package jourikisoJava5;

import java.util.ArrayList;
import java.util.Arrays;

import static jourikisoJava5.binary.convertFromBinary;
import static jourikisoJava5.binary.convertToBinary;

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

    public static int adder(int a, int b){
        ArrayList<Boolean> aa = convertToBinary(a);
        ArrayList<Boolean> bb = convertToBinary(b);
        ArrayList<Boolean> result = new ArrayList<>();
        boolean[] data;
        boolean carryForward = false;
        for(int i=0; i<=aa.size() || i<=bb.size(); i++){
            if(i<aa.size() && i<bb.size()){
                data = fullAdder(aa.get(i), bb.get(i), carryForward);
                result.add(data[0]);
                carryForward = data[1];
            } else if (i<aa.size()) {
                data = fullAdder(aa.get(i), false, carryForward);
                result.add(data[0]);
                carryForward = data[1];
            } else if (i<bb.size()) {
                data = fullAdder(false, bb.get(i), carryForward);
                result.add(data[0]);
                carryForward = data[1];
            }else{
                result.add(carryForward);
            }
        }
        return convertFromBinary(result);
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(semiAdder(true, false)));
        System.out.println(Arrays.toString(fullAdder(true, true,false)));
        System.out.println(adder(33453,4352));
    }
}
