import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap gia tri a: ");
        int a = in.nextInt();
        System.out.print("Nhap gia tri b: ");
        int b = in.nextInt();
        System.out.println("a / b = " + (a/b) );
        System.out.print("Nhap gia tri c: ");
        Double c = in.nextDouble();
        System.out.print("Nhap gia tri d: ");
        Double d = in.nextDouble();
        System.out.println("c / d = " + (c/d) );
        System.out.println("Vi a va b la so nguyen nen khi chia so khong cho ra gia tri so thuc khong ta co the cho a thuoc kieu double thi ta duoc ket qua 1,5.");
        in.close();
    }

}
