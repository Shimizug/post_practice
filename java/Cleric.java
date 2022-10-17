public class Cleric{
  String name;
  int hp = 50;
  final int maxHp = 50;
  int mp = 10;
  final mp maxMp = 10;
  public void selfAid(){
    this.mp -= 5;
    this.hp = this.maxHp;
    System.out.println(this.name + "はセルフエイドにより最大回復");
  }
  
}