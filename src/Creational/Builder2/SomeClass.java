package Creational.Builder2;

public class SomeClass {
    private String type;
    private String typeOfLicence;
    private String weight;

    public SomeClass(String type, String typeOfLicence, String weight) {
        this.type = type;
        this.typeOfLicence = typeOfLicence;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeOfLicence() {
        return typeOfLicence;
    }

    public void setTypeOfLicence(String typeOfLicence) {
        this.typeOfLicence = typeOfLicence;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
