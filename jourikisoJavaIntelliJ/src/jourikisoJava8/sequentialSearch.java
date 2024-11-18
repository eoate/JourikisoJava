package jourikisoJava8;

import java.util.ArrayList;
import java.util.Arrays;

public class sequentialSearch {
    public static int sequential(ArrayList<Integer> list, int x){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==x)return i+1;
        }
        return -1;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,2,4,1,4));
        System.out.println(sequential(list,5));
    }
}
