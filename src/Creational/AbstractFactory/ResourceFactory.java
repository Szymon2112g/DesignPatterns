package Creational.AbstractFactory;

// Abstract Factory
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capMib);

}
