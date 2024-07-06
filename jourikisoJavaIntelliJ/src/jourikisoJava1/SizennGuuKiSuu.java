package jourikisoJava1;
import java.util.HashSet;

public class SizennGuuKiSuu {
	public static void main(String[] args) {
		//前述のように無限集合は実装できないが、要素数が2^32個を上回らない有限な範囲であれば(理論上)実装可能。
		//n以下の自然数の集合N_nは集合にfor分を用いて要素を追加することで実装できる。
		int n=5;
		HashSet<Integer> numbersA = new HashSet<>();
		for(int i=0; i<=n; i++) {
			numbersA.add(i);
		}
		System.out.println(numbersA); //出力:[0, 1, 2, 3, 4, 5]
		
		//n以下の偶数の集合も同じように実装できる。
		int e=10;
		HashSet<Integer> numbersE= new HashSet<>();
		for(int i=0; i<=e; i += 2) {
			numbersE.add(i);
		}
		System.out.println(numbersE); //出力:[0, 2, 4, 6, 8, 10]
		
		//n以下の奇数の集合も同じように実装できる。
		int o=10;
		HashSet<Integer> numbersO= new HashSet<>();
		for(int i=1; i<=o; i += 2) {
			numbersO.add(i);
		}
		System.out.println(numbersO); //出力:[1, 3, 5, 7, 9]
	}
}
