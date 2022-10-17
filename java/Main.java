public class Main{
  public static void main(String[] args){
    introduceOneself();
    email("あい", "class", "king");
    email("あい", "class");
    System.out.println(calcTriangleArea(10.0, 5.0));
    System.out.println(calcCircleArea(5.0));
  }
  public static void introduceOneself(){
    String name = "AKi";
    int age = 22;
    double height = 134.4;
    char eto = '辰';
    System.out.println(name + age + height + eto);
  }
  
  public static void email(String title, String address, String text){
    System.out.println(address);
    System.out.println(title);
    System.out.println(text);
  }
  public static void email(String address, String text){
    System.out.println(address);
    System.out.println(text);
  }
  public static double calcTriangleArea(double bottom, double height){
    return bottom * height / 2;
  }
  public static double calcCircleArea(double radius){
    return radius * radius * 3.14;
  }
}