package hw6;

import java.util.Iterator;
import java.util.Objects;

public class Laptop {
    String color;
    String brand;

    public Laptop(String brand, String color) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                ", brand" + "'" + this.brand + "'" +
                ", color" + "'" + this.color + "'" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(brand, laptop.brand) &&
                color == laptop.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color);
    }

    public Iterator iterator() {
        return iterator();
    }
}