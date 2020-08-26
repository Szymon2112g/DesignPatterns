package Creational.Builder2;

public class Client {

    public static void main(String[] args) {
        Dealler dealler = new Dealler();

        dealler.setVehicleBuilder(Vehicle.getBuilder());
        dealler.setTypeOfDrivingLicence("B");
        dealler.setTypeOfVehicle("Car");
        dealler.setWeight("Light");
        Vehicle car = dealler.construct();

        System.out.println(car);

        System.out.println("************************************************");

        dealler.setTypeOfDrivingLicence("B");
        dealler.setTypeOfVehicle("Bus");
        dealler.setWeight("Medium");
        Vehicle bus = dealler.construct();

        System.out.println(bus);

    }
}
