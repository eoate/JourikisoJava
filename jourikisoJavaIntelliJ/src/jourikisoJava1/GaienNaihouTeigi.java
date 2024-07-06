package jourikisoJava1;
import java.util.ArrayList;

public class GaienNaihouTeigi {
	public static void main(String[] args) {
		//外延的定義は今まで通り。内包的定義はforなど
		//例として1~5の2乗の集合を実装する
		ArrayList<Integer> numbersA = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			numbersA.add(i*i);
		}
		System.out.println(numbersA); //出力:[1, 4, 9, 16, 25]
	}
}
