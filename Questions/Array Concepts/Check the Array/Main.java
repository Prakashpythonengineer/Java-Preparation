import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int arr1[][] = {{50,60},{70,80},{90,100}};
        int arr2[][] = arr1;

        System.out.println(arr1==arr2);

        //Returns true because arr1 and arr2 are pointing to the same object. But, == operator compares the references not the values. So, it returns true.

        //Instead of == operator, we can use equals() method to compare the values of two arrays.

        System.out.println(arr1.equals(arr2));//method 1
        System.out.println(Arrays.equals(arr1,arr2));//method 2

        //For MultiDimensional Array, we can use deepEquals() method to compare the values of two arrays.

        System.out.print(Arrays.deepEquals(arr1,arr2));
        //method 3

        //Conclusion: Don't prefer "==" operator to compare the values of one arrays. Instead of that, use equals() method for 1D array and deepEquals() method for 2D array.
    }
}