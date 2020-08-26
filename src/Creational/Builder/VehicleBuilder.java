package Creational.Builder;

// abstract builder
abstract class VehicleBuilder {

    protected Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void createNewVehicleProduct() {
        vehicle = new Vehicle();
    }

    public abstract void setTypeOfVehicle();
    public abstract void setTypeOfDrivingLicence();
    public abstract void setWeight();
}
