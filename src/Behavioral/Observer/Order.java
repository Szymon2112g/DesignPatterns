package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private double shippingCost;
    private double itemCost;
    private double discount;
    private int count;

    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver orderObserver) {
        observers.add(orderObserver);
    }

    public void detach(OrderObserver orderObserver) {
        observers.remove(orderObserver);
    }

    public double getTotal() {
        return itemCost - discount + shippingCost;
    }

    public void addItem(double price) {
        itemCost += price;
        count++;
        observers.stream().forEach(orderObserver -> orderObserver.updated(this));
    }

    public int getCount() {
        return count;
    }

    public void setShippingCost(double cost) {
        this.shippingCost = cost;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getItemCost() {
        return itemCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", shippingCost=" + shippingCost +
                ", itemCost=" + itemCost +
                ", discount=" + discount +
                ", count=" + count +
                ", observers=" + observers +
                '}';
    }
}
