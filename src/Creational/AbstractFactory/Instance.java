package Creational.AbstractFactory;

// Abstract Product
public interface Instance {

    enum Capacity {micro, small, large};

    void start();
    void attachStorage(Storage storage);
    void stop();
}
