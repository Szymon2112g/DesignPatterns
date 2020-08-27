package Creational.FactoryMethod.Message;

// concrete product
public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "TextMessage";
    }
}
