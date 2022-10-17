public class Hero{
  String name;
  int hp;
  public void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した");
  }
  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は" + sec + "ポイント回復した");
  }
  public void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は5のダメージ");
  }
  public  void run(){
    System.out.println(this.name +"は逃げ出した。最終HPは" + this.hp);
  }
}