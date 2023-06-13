import java.util.Scanner;
//In this program we will get the input from the user
public class _Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = null;
        int length = sc.nextInt();
        arr = new int[length];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }        
        System.out.println("Length of the array is: "+arr);
    }

}