package Creational.FactoryMethod;

import Creational.FactoryMethod.Message.Message;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.getMessage();
        System.out.println(message.getContent());
    }
}
