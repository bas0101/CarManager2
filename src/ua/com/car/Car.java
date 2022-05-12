package ua.com.car;

import java.util.Objects;

public class Car {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;

    public Car(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && price == car.price && weight == car.weight && Objects.equals(name, car.name) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfProduction, price, weight, color);
    }
}
