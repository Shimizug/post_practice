public class Fib{
  public static void main(String[] args){
    int a = 1;
    int b = 1;
    System.out.println(a + "\n" +b);
    while(a < 1000){
    int c = a + b;
    b = a;
    a = c;
    System.out.println(c);
    }
  }
}