package jourikisoJava1;
import java.util.HashSet;
import java.util.Set;

public class BoolSyugou {
	public static void main(String[] args) {
		//bool集合はBoolean型をSetにいれることで実装できる。
		HashSet<Boolean> boolList = new HashSet<>(Set.of(true,false));
		System.out.println(boolList); //出力:[true, false]
	}
}
