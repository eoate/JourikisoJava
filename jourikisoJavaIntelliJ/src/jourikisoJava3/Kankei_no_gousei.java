package jourikisoJava3;


import java.util.*;

public class Kankei_no_gousei {
    public static HashSet<List<Integer>> composition(HashSet<List<Integer>> numbersR, HashSet<List<Integer>> numbersS){
        HashSet<List<Integer>> numbersResult = new HashSet<>();
        for (List<Integer> listR : numbersR) {
            for (List<Integer> listS : numbersS) {
                List<Integer> list = new ArrayList<>();
                if(listR.get(1).equals(listS.getFirst())){
                    list.add(listR.getFirst());
                    list.add(listS.get(1));
                    numbersResult.add(list);
                }
            }
        }
        return numbersResult;
    }

    public static void main(String[] args) {
        HashSet<List<Integer>> numbersR = new HashSet<>(Set.of(Arrays.asList(1,2),Arrays.asList(1,3),Arrays.asList(2,3)));
        HashSet<List<Integer>> numbersS = new HashSet<>(Set.of(Arrays.asList(2,3),Arrays.asList(2,4),Arrays.asList(3,4)));

        System.out.println(composition(numbersR, numbersS)); //出力;[[1, 3], [2, 4], [1, 4]]
    }
}
