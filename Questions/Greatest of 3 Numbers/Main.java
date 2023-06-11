     
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int x,y,z;
      x = sc.nextInt();
      y = sc.nextInt();
      z = sc.nextInt();
      int output = (x>y && x>z)? x : (y>x && y>z)? y : z;
      System.out.print(output);
      sc.close();
   }
}