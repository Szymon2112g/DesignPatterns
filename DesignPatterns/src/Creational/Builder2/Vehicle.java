package Creational.Builder2;

// product
public class Vehicle {

    private String typeOfVehicle;
    private String typeOfDrivingLicence;
    private String weight;

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    private void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getTypeOfDrivingLicence() {
        return typeOfDrivingLicence;
    }

    private void setTypeOfDrivingLicence(String typeOfDrivingLicence) {
        this.typeOfDrivingLicence = typeOfDrivingLicence;
    }

    public String getWeight() {
        return weight;
    }

    private void setWeight(String weight) {
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

    public static VehicleBuilder getBuilder() {
        return new VehicleBuilder();
    }

    // builder
    public static class VehicleBuilder {
        private String typeOfVehicle;
        private String typeOfDrivingLicence;
        private String weight;
        private Vehicle vehicle;

        public VehicleBuilder withTypeOfVehicle(String type) {
            typeOfVehicle = type;
            return this;
        }

        public VehicleBuilder withTypeOfDrivingLicence(String type) {
            typeOfDrivingLicence = type;
            return this;
        }

        public VehicleBuilder withWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public Vehicle build() {
            this.vehicle = new Vehicle();

            vehicle.setTypeOfDrivingLicence(typeOfDrivingLicence);
            vehicle.setTypeOfVehicle(typeOfVehicle);
            vehicle.setWeight(weight);

            return this.vehicle;
        }

        public Vehicle getVehicle() {
            return this.vehicle;
        }
    }

}
