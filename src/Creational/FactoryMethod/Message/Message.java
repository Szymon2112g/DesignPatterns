package Creational.FactoryMethod.Message;

// abstract product
public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() { }

    public void encrypt() { }
}
