package jourikisoJava2;

import java.util.ArrayList;
import java.util.Arrays;

public class Junkantikan {
    public static void main(String[] args) {
        //巡回置換の例を実装する
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4));
        for(int i=0; i<numbers.size(); i++){
            if(i == numbers.size()-1){
                System.out.println(numbers.get(i) + "→" + numbers.getFirst());
            }else{
                System.out.println(numbers.get(i) + "→" + numbers.get(i+1));
            }
        } /*出力:1→2
                2→3
                3→4
                4→1*/
        System.out.print("略記は (");
        for(int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println(")");
        //出力:略記は (1 2 3 4 )
    }
}
