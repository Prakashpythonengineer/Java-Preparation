import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        
        int arr[][] = {{1,2},{3,4},{5,6}};
        System.out.println("Length"+arr.length);

        //Iteration
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
        
        //Ahhhhh I got it!!

        for(int[] i:arr){
            for(int j: i){
                System.out.println(j);
            }
        }   
        //Output: 1 2 3 4 5 6

        //Using deepToString method
        System.out.println(Arrays.deepToString(arr));
    }
}