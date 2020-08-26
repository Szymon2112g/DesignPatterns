package Creational.AbstractFactory.gcp;

import Creational.AbstractFactory.Instance;
import Creational.AbstractFactory.Storage;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance";
    }
}
