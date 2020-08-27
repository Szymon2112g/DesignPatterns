package Creational.FactoryMethod;

import Creational.FactoryMethod.Message.Message;

// abstract creator
public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    // factory method
    protected abstract Message createMessage();
}
