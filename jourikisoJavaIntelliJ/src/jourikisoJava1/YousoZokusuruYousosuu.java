package jourikisoJava1;
import java.util.HashSet;
import java.util.Set;

public class YousoZokusuruYousosuu {
	public static void main(String[] args) {
		//指定の要素が属するかどうかは集合を定義する各クラスのcontainメソッドを用いて判定できる
		HashSet<Integer> numbersS = new HashSet<>(Set.of(1,2,4));
		
		System.out.println(numbersS.contains(1)); //出力:true
		System.out.println(numbersS.contains(3)); //出力:false

		//要素数はsizeメソッドを用いて取得できる(書いてないっけ？)
		System.out.println(numbersS.size());
	}
}
