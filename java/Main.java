public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    
    System.out.println("勇者" + h.name + "の誕生");
    h.sit(9);
    h.slip();
    h.sit(5);
    h.run();
  
  }
}