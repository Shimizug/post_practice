puublic class Chapter07{
  public static void main(String[] args{
    int distance = 13;
    if (distance <= 5){
      System.out.println("とても近いです");
    }else if (distance <= 10){
      System.out.println("近いです");
    }else if (distance <= 15){
      System.out.println("遠いです");
    }else{
      System.out.println("とても遠いです");
    }
    String color = "yellow";
    switch(color){
      case "red":
        System.out.println("赤です");
        break;
      case "yellow":
        System.out.println("黄色です");
        break;
      case "blue":
        System.out.println("青です");
        break;
      default:
        System.out.println("信号の色ではありません");
    }
  }
}


