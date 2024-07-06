package jourikisoJava1;
import java.util.HashSet;
import java.util.Set;

public class TajuuSyugou_Shugouzoku_Isuu {

	public static void main(String[] args) {
		//多重集合は集合の中に集合を入れれば実装できる。
		HashSet<Integer> numbersS1 = new HashSet<>(Set.of(1,2,3));
		HashSet<Integer> numbersS2 = new HashSet<>(Set.of(4,5,6));
		HashSet<Integer> numbersS3 = new HashSet<>(Set.of(7,8,1));
		HashSet<HashSet> numbersSS = new HashSet<>(Set.of(numbersS1,numbersS2,numbersS3)); //"HashSetはraw型です。総称型HashSet<E>への参照は,パラメーター化する必要があります"と出るが、エラーではない？
		System.out.println(numbersSS); //出力:[[1, 7, 8], [1, 2, 3], [4, 5, 6]]
		//ただし集合に入れる要素の型を指定する必要があるため、集合が入っている集合に直接数値を入れることはできない。
		//そのため、javaで実装できる多重集合はすべて集合族となる。
		//位数はforeachを用いる。なぜかintで定義したやつをforeach内で使えない...->HashSetはつかえたのでこれのsizeを使うことで実装する
		HashSet<HashSet> count = new HashSet<>();
		numbersSS.forEach(s ->{
			if(s.contains(1)){
				count.add(s);
			}
		});
		System.out.println("1の位数は" + count.size()); //出力:1の位数は2
	}
}
