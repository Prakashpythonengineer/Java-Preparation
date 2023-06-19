import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        //Adding Elements
        cars.add("KIA");
        cars.add("Seltos");
        cars.add("MG");
        cars.add("Innova");
        cars.add("Hector");

        
        System.out.print(cars);//[KIA, Seltos, MG, Innova, Hector]
        

        System.out.print(cars.get(0));//KIA

        cars.set(0, "KIA MOTORS");//TO change the value at index 0

        cars.clear(); // To clear the ArrayList

        cars.size();//To get the size of the ArrayList
        

    }
}