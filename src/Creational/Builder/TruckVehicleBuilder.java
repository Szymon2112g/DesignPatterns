package Creational.Builder;

// concrete builder
public class TruckVehicleBuilder extends VehicleBuilder {

    @Override
    public void setTypeOfVehicle() {
        vehicle.setTypeOfVehicle("Truck");
    }

    @Override
    public void setTypeOfDrivingLicence() {
        vehicle.setTypeOfDrivingLicence("C");
    }

    @Override
    public void setWeight() {
        vehicle.setWeight("Heavy");
    }
}
