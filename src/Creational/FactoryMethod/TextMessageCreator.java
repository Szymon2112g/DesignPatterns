package Creational.FactoryMethod;

import Creational.FactoryMethod.Message.Message;
import Creational.FactoryMethod.Message.TextMessage;

// concrete creator
public class TextMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
