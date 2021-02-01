import java.util.Scanner;
import java.util.Random;

public class Project{
    public static void Cau1(){
        System.out.print("Hello All! Welcome to code P soft group!");
    }

    public static void Cau2(){
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

    public static void Cau3(){
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

    public static void Cau4(){
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

    public static void Cau5(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap gia tri cua a: ");
            double a = sc.nextDouble();
            System.out.print("Nhap gia tri cua b: ");
            int b = sc.nextInt();
            System.out.println("a / b = " + (a/b) );
            sc.close();
    }

    public static void Cau6(){
        final float PI = 3.14f;
        // int PI = 3.14159;
         System.out.println(PI); 
         System.out.println("Khong the thay doi gia tri hang. Chi co the thay doi gia tri hang trong ham hang final.");
    }

    public static void Cau8(){
        int i = 369;
        i = doThis(i);
        System.out.println(i);
    }
  
    public static int doThis(int i){
        Random sc = new Random();
        i = sc.nextInt();
        return i;
    }

    public static void Cau10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của a,b kiểu int");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Nhập giá trị của c,d kiểu double");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println("Chuyển đổi giá trị kiểu int sang double:");
        double e = (double) a;
        double f = (double) b;
        System.out.println(e + " " + f);
        System.out.println("Chuyển đổi giá trị kiểu double sang int:");
        int g = (int) c;
        int h = (int) d;
        System.out.println(g + " " + h);
        sc.close();
    }
    

    public static void Cau11(){
        System.out.println("Khong co gia tri nao co suc chua so tren 2^64 nen khong the thuc hien duoc");
    }
    
    public static void main(String[] args){
        int choiceNumber;
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("\n1.Câu 1");
            System.out.println("2.Câu 2");
            System.out.println("3.Câu 3");
            System.out.println("4.Câu 4");
            System.out.println("5.Câu 5");
            System.out.println("6.Câu 6");
            System.out.println("7.Câu 8");
            System.out.println("8.Câu 10");
            System.out.println("9.Câu 11");
            System.out.println("10.Thoát.");

             
            do {
                System.out.println("Bấm số để chọn (1..10): ");
                choiceNumber = sc.nextInt();
            } while ((choiceNumber < 1) || (choiceNumber > 10));
             
            switch (choiceNumber) {
                case 1:
                    System.out.println("Bạn chọn chức năng thứ nhất!");
                    Cau1();
                    break;
                case 2:
                    System.out.println("Bạn chọn chức năng thứ hai!");
                    Cau2();
                    break;
                case 3:
                    System.out.println("Bạn chọn chức năng thứ ba!");
                    Cau3();
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng thứ tư!");
                    Cau4();
                    break;
                case 5:
                    System.out.println("Bạn chọn chức năng thứ năm!");
                    Cau5();
                    break;
                case 6:
                    System.out.println("Bạn chọn chức năng thứ sáu!");
                    Cau6();
                    break;
                case 7:
                    System.out.println("Bạn chọn chức năng thứ bảy!");
                    Cau8();
                    break;
                case 8:
                    System.out.println("Bạn chọn chức năng thứ tám!");
                    Cau10();
                    break;
                case 9:
                    System.out.println("Bạn chọn chức năng thứ chín!");
                    Cau11();
                    break;
                case 10:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                    break;
             }
             sc.close();
         }
     }
}
