import java.util.Scanner;
/*
 A year is called a leap year if the year is divisible by four, except for the years which are divisible by 100 but not divisible by 400. Therefore, the year 2000 was a leap year, but the years 1700, 1800, and 1900 were not.
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = false;
        if ((year%4)==0 && ((year%400!=0)&&(year%100==0))){
            leap = true;
        }
        System.out.print(leap);
    }
}