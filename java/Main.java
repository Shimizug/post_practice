public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    h.blade.name = "炎の剣";
    
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';
    
    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';
    
    Cleric c = new Cleric();
    c.name = "聖職者";
    
    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    
    System.out.println("勇者" + h.name + "を生み出しました!");
    h.sit(5);
    h.slip();
    h.sit(25);
    m1.run();
    m2.run();
    h.run();
    c.selfAid();
    c.pray(2);
    h.attack();
    w.heal(h);
  }
}