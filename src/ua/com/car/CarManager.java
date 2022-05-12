package ua.com.car;



public class CarManager {

    public static void main(String[] args) {
       // Color.valueOf("GREEN")
        Car prius = new Car("Toyota Prius", 2008,
                15000, 1200, Color.GREEN);

        Car renualt = new Car( "Renault Laguna", 2000,
                9700, 1600, Color.valueOf("WHITE"));

        Car renualt2 = new Car( "Renault Laguna", 2000,
                9700, 1600, Color.valueOf("WHITE"));

        System.out.println(prius);
        System.out.println(renualt);


        System.out.println(prius.equals(renualt2));
        System.out.println(renualt.equals(renualt2));

    }

}
