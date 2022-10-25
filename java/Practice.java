public class Practice{
  public static void main(String[] args){
    //int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい
    int x = 1;
    int y = 2;
    int z = x;
    x = y;
    y = z;
    
    System.out.println(x + "と" + y)
  }
}