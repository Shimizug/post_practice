public class Output{
  public static void main(String[] args){
    for (int i = 2; i <= 20; i++){
      if (i % 15 == 0){
        System.out.println("かつ丼\￥850");
      }else if (i % 3 == 0){
        System.out.println("かつ丼");
      }
    }
  }
}