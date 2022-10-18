public class Main{
  public static void main(String[] args){
    Hero h = new Hero("ミナト");
    h.hp = 100;
    Hero h2 = new Hero();
    SYstem.out.println(h2.name);
    
    System.out.println("勇者" + h.name + "の誕生");
    h.sit(9);
    h.slip();
    h.sit(5);
    h.run();
  
  }
}