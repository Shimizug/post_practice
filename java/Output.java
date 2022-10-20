public class Output{
  public static void main(String[] args){
    for (int i = 2; i <= 20; i++){
      if (i % 15 == 0){
        System.out.println("かつ丼￥8５0");
      }else if (i % 3 == 0){
        System.out.println("かつ丼");
      }else if (i % 5 == 0){
        System.out.println("￥8５0");
      } else {
        System.out.println(i);
      }
    }
  }
}