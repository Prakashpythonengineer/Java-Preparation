import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Length of the array is: "+(arr.length));

        // Use can also toString method 
        System.out.println("Length of the array is: "+(Arrays.toString(arr)));
        // Output: [1,2,3,4,5]

        // use for loop
        for (int i: arr){
            System.out.println(i+" ");
        }
    }
    
}
