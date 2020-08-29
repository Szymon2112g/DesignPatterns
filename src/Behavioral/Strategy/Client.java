package Behavioral.Strategy;

public class Client {
    public static void main(String[] args) {
        BillingStrategy normalStrategy = BillingStrategy.normalStrategy();
        BillingStrategy happyHourStrategy = BillingStrategy.happyHourStrategy();

        Customer customer1 = new Customer(normalStrategy);
        customer1.add(2, 50);

        customer1.setStrategy(happyHourStrategy);

        customer1.add(4, 50);

        customer1.printBill();

    }
}
