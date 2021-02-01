public class Cau2{
  public static void main(String[] args){
    int a = 15;
    int b = 8;
    double c = 14.5454;
    double d = 6.3523;
    ToanTu(a,b);
    ToanTu(c,d);
  }

  public static void ToanTu(double a, double b){
    System.out.println(a + "  +" + b + "="  + (a+b));
    System.out.println(a + " - " + b + "="  + (a-b));
    System.out.println(a + " * " + b + "="  + (a*b));
    System.out.println(a + " / " + b + "="  + (a/b));
    System.out.println(a + " % " + b + "="  + (a%b));

  }
}