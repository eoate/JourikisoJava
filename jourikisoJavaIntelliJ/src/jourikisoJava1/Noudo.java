package jourikisoJava1;
import java.util.HashSet;
import java.util.Set;

public class Noudo {
	public static void main(String[] args) {
		//有限集合において、集合の要素数を表す濃度はsizeメソッドをつかうことでもとめられる。
		HashSet<Integer> numbersA = new HashSet<>(Set.of(1,2,3));
		System.out.println(numbersA.size()); //出力:3
	}
}
