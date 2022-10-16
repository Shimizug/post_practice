public class Main{
  public static void main(String[] args){
    int isHungry = new java.util.Random().nextInt(1);
    String food = "rice";
    System.out.println("こんにちは")
    if (isHungry == 0){
      System.out.println("お腹がいっぱいです");
    }else{
      System.out.println("はらぺこです");
    }
  }
}