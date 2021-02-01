import java.util.Random;

public class Cau8 {
    public static void main(String[] args){
        int i = 369;
        i = doThis(i);
        System.out.println(i);
      }
  
      public static int doThis(int i){
        Random sc = new Random();
        i = sc.nextInt();
        return i;
      }
}
