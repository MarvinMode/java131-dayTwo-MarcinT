package Exercise12;


// Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj.
// Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .
//
//Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji, lista producentów (Manufacturer),
// oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3).
// Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals()

import java.time.Year;
import java.util.Objects;

public class Manufacture {
    private String name;
    private Year yearOfFoundation;
    private String country;

    public Manufacture(String name, int yearOfFoundation, String country) {
        this.name = name;
        this.yearOfFoundation = Year.of(yearOfFoundation);
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacture that = (Manufacture) o;
        return name.equals(that.name) && yearOfFoundation.equals(that.yearOfFoundation) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFoundation, country);
    }
}
