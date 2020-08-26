package Creational.Builder;

public class Client {

    public static void main(String[] args) {
        Dealler dealler = new Dealler();

        VehicleBuilder truckBuilder = new TruckVehicleBuilder();
        VehicleBuilder carBuilder = new CarVehicleBuilder();

        dealler.setVehicleBuilder(truckBuilder);
        dealler.constructVehicle();
        Vehicle truckVehicle = dealler.getVehicle();
        System.out.println(truckVehicle.toString());

        System.out.println("************************************************");

        dealler.setVehicleBuilder(carBuilder);
        dealler.constructVehicle();
        Vehicle carVehicle = dealler.getVehicle();
        System.out.println(carVehicle.toString());
    }
}
