public class Main{
    public static void main(String[] args) {
        
        //Simply you can use for loop to merge two arrays by adding them into a new array. But, it is not a good practice. So, we will use arraycopy() method to merge two arrays.

        //But before that, we need to know the syntax of arraycopy() method.

        //Syntax: arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

        //src: Source Array
        //srcPos: Starting position in the source array
        //dest: Destination Array
        //destPos: Starting position in the destination array
        //length: Number of array elements to be copied

        //Cool it's Simple!!

        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {7,8,9,10,11,12};

        int arr3[] = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);

        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        //Yuppppp we did it!!


    }
}