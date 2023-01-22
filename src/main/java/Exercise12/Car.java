package Exercise12;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private BigDecimal price;
    private Year yearOfProduction;
    private List<Manufacture> manufactures;
    private EngineType engineType;

    public Car(String name, String model, String price, int yearOfProduction, List<Manufacture> manufactures, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = new BigDecimal(price);
        this.yearOfProduction = Year.of(yearOfProduction);
        this.manufactures = manufactures;
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(yearOfProduction, car.yearOfProduction) && Objects.equals(manufactures, car.manufactures) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfProduction, manufactures, engineType);
    }
}
