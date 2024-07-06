package jourikisoJava1;
import java.util.HashSet;
import java.util.Set;

public class YousoZokusuru {
	public static void main(String[] args) {
		//指定の要素が属するかどうかは集合を定義する各クラスのcontainメソッドを用いて判定できる
		HashSet<Integer> numbersL = new HashSet<>(Set.of(1,2,4));
		
		System.out.println(numbersL.contains(1)); //出力:true
		System.out.println(numbersL.contains(3)); //出力:false
	}
}
