import java.util.Scanner;

public class Cau5{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhap gia tri cua a: ");
     double a = sc.nextDouble();
     System.out.print("Nhap gia tri cua b: ");
     int b = sc.nextInt();
     System.out.println("a / b = " + (a/b) );
     sc.close();
    }
}