package Creational.Builder;

// concrete builder
public class CarVehicleBuilder extends VehicleBuilder {

    @Override
    public void setTypeOfVehicle() {
        vehicle.setTypeOfVehicle("Car");
    }

    @Override
    public void setTypeOfDrivingLicence() {
        vehicle.setTypeOfDrivingLicence("B");
    }

    @Override
    public void setWeight() {
        vehicle.setWeight("Light");
    }
}
