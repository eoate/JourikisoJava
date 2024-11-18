package jourikisoJava8;

import java.util.ArrayList;
import java.util.Arrays;

public class binarySearch {
    public static int binary(ArrayList<Integer> list, int x){
        int i=1,j=list.size();
        while(i<=j){
            int m=(i+j)/2;
            if(list.get(m-1)==x)return m;
            else if (list.get(m-1)>x) j=m-1;
            else i=m+1;
        }
        return -1;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,5,6,8));
        System.out.println(binary(list,8));
    }
}
