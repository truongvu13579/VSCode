import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri a = ");
        double a = sc.nextDouble();
        double c;
        c = Math.pow(a,2);
        System.out.print("Nhap gia tri b = ");
        double b = sc.nextDouble();
        System.out.println("a^2 + b = " + (c + b));
        sc.close();
    }
    
}