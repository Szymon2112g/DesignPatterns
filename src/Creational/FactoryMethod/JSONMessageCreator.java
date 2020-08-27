package Creational.FactoryMethod;

import Creational.FactoryMethod.Message.JSONMessage;
import Creational.FactoryMethod.Message.Message;

// concrete creator
public class JSONMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}
