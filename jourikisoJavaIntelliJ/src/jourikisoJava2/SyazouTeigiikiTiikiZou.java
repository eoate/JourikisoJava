package jourikisoJava2;

public class SyazouTeigiikiTiikiZou {
    //写像(関数)をメソッドに定義する。ここではメソッドfと値nにともにint型を用いているがこれが定義域、値域に対応する。
    public static int f(int n){
        n = 3*n-1;
        return (n);
    }
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            System.out.print("f(" + i + ")=" + f(i));
            System.out.println();
        }/*出力:f(1)=2
               f(2)=5
               f(3)=8
               f(4)=11
                */
        int a = 6;
        System.out.println("fによる要素" + a +"の像はf(" + a + ")=" + f(a) + "です");
        //出力:fによる要素6の像はf(6)=17です
    }
}
