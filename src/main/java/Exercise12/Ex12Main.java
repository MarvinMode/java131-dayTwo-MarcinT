package Exercise12;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Ex12Main {
    public static void main(String[] args) {
        Manufacture manufacture1 = new Manufacture("Ford", 1940,"USA");
        Manufacture manufacture2 = new Manufacture("Ford", 1940,"USA");
        Manufacture manufacture3 = new Manufacture("Toyota",1960,"Japan");

        System.out.println(manufacture1.equals(manufacture2));
    }

    List<Manufacture> manufactureList1 = new ArrayList<>();

//    Car car1 = new Car("toyota","Supra","420.000,00",1999, );
}
