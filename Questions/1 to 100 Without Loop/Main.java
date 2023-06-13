public class Main {
  public static void main(String[] args) {

    // variable
    int n = 100;
    
    // method call
    System.out.println("Displaying from 1 to 100: ");
    display(n);
  }

  // recursive method
  public static void display(int n) {
     if(n > 1)
       display(n-1);
     System.out.print(n+" ");
  }

}