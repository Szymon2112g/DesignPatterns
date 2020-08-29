package Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final List<Integer> drinks = new ArrayList<>();
    private BillingStrategy strategy;

    public Customer(BillingStrategy billingStrategy) {
        this.strategy = billingStrategy;
    }

    public void add(int price, int quantity) {
        this.drinks.add(this.strategy.getActPrice(price * quantity));
    }

    public void printBill() {
        int sum = this.drinks.stream().mapToInt(v -> v).sum();
        System.out.println("Total due: " + sum);
        this.drinks.clear();
    }

    public void setStrategy(BillingStrategy billingStrategy) {
        this.strategy = billingStrategy;
    }
}
