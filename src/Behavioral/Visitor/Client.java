package Behavioral.Visitor;

public class Client {

    public static void main(String[] args) {
        Car car = new Car();

        car.accept(new CarElementDoVisitor());
        car.accept(new CarElementPrintVisitor());
    }

}
