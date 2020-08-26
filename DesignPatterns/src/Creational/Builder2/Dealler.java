package Creational.Builder2;

// supervisor
public class Dealler {

    private String typeOfVehicle;
    private String typeOfDrivingLicence;
    private String weight;

    private Vehicle.VehicleBuilder vehicleBuilder;

    public void setVehicleBuilder(Vehicle.VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setTypeOfDrivingLicence(String typeOfDrivingLicence) {
        this.typeOfDrivingLicence = typeOfDrivingLicence;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Vehicle construct() {
        return vehicleBuilder.withTypeOfDrivingLicence(typeOfDrivingLicence)
                    .withTypeOfVehicle(typeOfVehicle)
                    .withWeight(weight)
                    .build();
    }

    public Vehicle getVehicle() {
        return vehicleBuilder.getVehicle();
    }

}
