package jourikisoJava2;

public class BubunKansuuZenikikansuu {
    public static void main(String[] args){
        //部分関数の例として√を求める関数を実装する
        //-の数のルートは実数の範囲で定義されないが、javaではNaNと出力されるため全域関数となる
        int n = 4;
        int r = -4;
        System.out.println(Math.sqrt(n)); //出力:2.0
        System.out.println(Math.sqrt(r)); //出力:NaN
        //Math.sqrtによって出力される値はdouble型であるため2.0が出力された
    }
}
