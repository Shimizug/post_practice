public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    
    Matango ml = new Matango();
    ml.hp = 50;
    ml.suffix = 'A';
    
    System.out.println("勇者" + h.name + "の誕生");
    h.sit(9);
    h.slip();
    h.sit(5);
    h.run();
    ml.ran();
  }
}