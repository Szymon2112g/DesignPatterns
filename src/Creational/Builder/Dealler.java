package Creational.Builder;

// supervisor
public class Dealler {

    private VehicleBuilder vehicleBuilder;

    public void setVehicleBuilder(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    public Vehicle getVehicle() {
        return vehicleBuilder.getVehicle();
    }

    public void constructVehicle() {
        vehicleBuilder.createNewVehicleProduct();
        vehicleBuilder.setTypeOfDrivingLicence();
        vehicleBuilder.setTypeOfVehicle();
        vehicleBuilder.setWeight();
    }
}
