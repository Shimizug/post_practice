Public class Meshi{
  public static void main(String[] args){
    int isHungry = new java.util.Random().nextInt(1);
    String food = "お米";
    System.out.prinntln("こんにちは");
    if (isHungry == 0){
      System.out.println("お腹がいっぱいです");
    }else{
      System.out.println("はらぺこです");
      System.out.println(food + "いただきます。");
    }
    System.out.println("ごちそうさまでした")
  }
}