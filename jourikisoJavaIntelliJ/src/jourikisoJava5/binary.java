package jourikisoJava5;

import java.util.ArrayList;
import static jourikisoJava5.SinritiHenkan.truthValue;
import static jourikisoJava5.SinritiHenkan.truthValueNumber;

public class binary {
    public static ArrayList<Boolean> convertToBinary(int a){
        ArrayList<Boolean> numbers = new ArrayList<>();
        while(a >0){
            numbers.add(truthValue(a%2));
            a = a/2;
        }
        return numbers;
    }
    public static int convertFromBinary(ArrayList<Boolean> a){
        int power = 1;
        int result = 0;
        for (Boolean aBoolean : a) {
            result += power * truthValueNumber(aBoolean);
            power *= 2;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(convertToBinary(104));
        System.out.println(convertFromBinary(convertToBinary(984)));
    }
}
