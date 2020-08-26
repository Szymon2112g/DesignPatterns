package Creational.Builder2;

public class Client {

    public static void main(String[] args) {
        Dealler dealler = new Dealler();

        SomeClass someCar = new SomeClass("Car", "B", "light");
        SomeClass someTruck = new SomeClass("Bus", "B", "Medium");

        dealler.setVehicleBuilder(Vehicle.getBuilder());
        dealler.setSomeClass(someCar);
        Vehicle car = dealler.construct();

        System.out.println(car);

        System.out.println("************************************************");

        dealler.setSomeClass(someTruck);
        Vehicle bus = dealler.construct();

        System.out.println(bus);

    }
}
