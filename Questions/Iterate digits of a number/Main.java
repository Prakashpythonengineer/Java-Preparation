import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scan.nextInt();

      // if number is negative then make it positive
      if (num < 0) {
         num *= -1;
      }

      // count number of digits
      int temp = num;
      int totalDigits = 0;
      while (temp != 0) {
         totalDigits++;
         temp /= 10;
      }

      // iterate through each digit of the number
      System.out.println("Digits in the given number are: ");
      for (int i = totalDigits - 1; i >= 0; i--) {
         int digit = (num / (int) Math.pow(10, i)) % 10;
         System.out.print(digit + " ");
      }
      scan.close();
   }
}