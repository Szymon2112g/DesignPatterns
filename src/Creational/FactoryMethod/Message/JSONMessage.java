package Creational.FactoryMethod.Message;

// concrete product
public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "JSON";
    }
}
