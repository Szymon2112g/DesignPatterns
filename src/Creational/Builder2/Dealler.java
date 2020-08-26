package Creational.Builder2;

// supervisor
public class Dealler {

    private SomeClass someClass;
    private Vehicle.VehicleBuilder vehicleBuilder;

    public void setSomeClass(SomeClass someClass) {
        this.someClass = someClass;
    }

    public void setVehicleBuilder(Vehicle.VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    public Vehicle construct() {
        return vehicleBuilder.withTypeOfDrivingLicence(someClass.getTypeOfLicence())
                    .withTypeOfVehicle(someClass.getType())
                    .withWeight(someClass.getWeight())
                    .build();
    }

    public Vehicle getVehicle() {
        return vehicleBuilder.getVehicle();
    }

}
