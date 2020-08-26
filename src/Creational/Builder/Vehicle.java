package Creational.Builder;

// product
public class Vehicle {

    private String typeOfVehicle;
    private String typeOfDrivingLicence;
    private String weight;

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getTypeOfDrivingLicence() {
        return typeOfDrivingLicence;
    }

    public void setTypeOfDrivingLicence(String typeOfDrivingLicence) {
        this.typeOfDrivingLicence = typeOfDrivingLicence;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "typeOfVehicle='" + typeOfVehicle + '\'' +
                ", typeOfDrivingLicence='" + typeOfDrivingLicence + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
