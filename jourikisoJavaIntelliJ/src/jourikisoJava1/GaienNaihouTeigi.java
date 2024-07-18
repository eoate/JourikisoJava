package jourikisoJava1;
import java.util.ArrayList;
import java.util.Arrays;

public class GaienNaihouTeigi {
	public static void main(String[] args) {
		//外延的定義は今まで通り。内包的定義はforなど
		//例として1~5の2乗の集合を実装する
		ArrayList<Integer> numbersA1 = new ArrayList<>(Arrays.asList(1,4,9,16,25));
		System.out.println(numbersA1); //出力:[1, 4, 9, 16, 25]
		ArrayList<Integer> numbersA2 = new ArrayList<>();
		for(int i=1; i<=5; i++) numbersA2.add(i*i);
		System.out.println(numbersA2); //出力:[1, 4, 9, 16, 25]
	}
}
