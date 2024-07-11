package jourikisoJava1;

import java.util.HashSet;
import java.util.Set;

public class Syugou {
	public static void main(String[] args) {
		//集合はSetクラスを利用して定義できる。
		//順序不定なのでn番目の要素を取り出す操作はできない
		HashSet<Integer> numbersS = new HashSet<>(Set.of(1,4,2));
		//Set.ofを用いる場合同じ要素を複数入れようとするとエラーが出る(Set.ofでSetを実装してそれを代入しているため重複できない)
		//addメソッドを用いれば重複する要素をエラーを出さずに入れることができるが、重複不可なので1つだけ入ることになる
		System.out.println(numbersS); //出力:[1, 2, 4]
	}
}
