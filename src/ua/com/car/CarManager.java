package ua.com.car;



public class CarManager {

    public static void main(String[] args) {
       // Color.valueOf("GREEN")
        PassengerCar prius = new PassengerCar("Toyota Prius", 2008,
                15000, 1200, Color.GREEN);

        Car renualt = new Car( "Renault Laguna", 2000,
                9700, 1600, Color.valueOf("WHITE"));

        Car renualt2 = new Car( "Renault Laguna", 2000,
                9700, 1600, Color.valueOf("WHITE"));

        prius.addDistance(1000);
        prius.addDistance(50);
        prius.addDistance(15000);
        renualt.addDistance(5000);

        System.out.println(prius);
        System.out.println(renualt);


       System.out.println(prius.isReadyToService());
       System.out.println(renualt.isReadyToService());

    }

}
