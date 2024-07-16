package jourikisoJava1;

import java.util.ArrayList;
import java.util.Arrays;

public class KumiNoDoitusei {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(3,5,5,6));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3,5,5,6));
        ArrayList<Integer> numbers3= new ArrayList<>(Arrays.asList(3,5,6));
        System.out.println(numbers2.equals(numbers1)); //出力:true
        System.out.println(numbers3.equals(numbers1)); //出力:false
    }
}
