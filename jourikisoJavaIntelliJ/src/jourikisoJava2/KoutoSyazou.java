package jourikisoJava2;

public class KoutoSyazou {
    //fが恒等関数であるかどうかを判定する。
    public static int f(int n){
        return n;
    }
    public static void main(String[] args) {
        boolean is = true;
        for(int i=1;i<=10;i++){
            if(f(i)!=i){
                System.out.println("fは恒等写像ではない");
                is = false;
                break;
            }
        }
        if(is){
            System.out.println("fは恒等写像です");
        }
    } // 出力:fは恒等写像です
      //fのreturnの後の部分をn+1などに変えるとfは恒等写像ではないと出力される
}
