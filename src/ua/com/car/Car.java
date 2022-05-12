package ua.com.car;
import java.util.Objects;

public class Car {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;


    public Car(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void addDistance(int additionalDaistance){
        if(additionalDaistance < 0){
            System.out.println("<0");
        } else {
            distance = distance + additionalDaistance;
        }
    }




    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
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
