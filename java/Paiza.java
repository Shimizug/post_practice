import java.util.*;


public class Paiza {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int N = new Scanner(System.in).nextInt();
        int X = 2;
        int Y = 4;
        if(N % X == 0 && N % Y == 0){
            System.out.println("AB");
        }else if (N % X == 0){
            System.out.println("A");
        }else if(N % Y == 0){
            System.out.println("B");
        }else{
            System.out.println("N");
        }
    }
}