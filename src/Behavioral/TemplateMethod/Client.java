package Behavioral.TemplateMethod;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        Order order = new Order("1001");

        order.addItem("Soda", 2.50);
        order.addItem("Sandwitch", 11.90);
        order.addItem("Pizza", 12.50);

        OrderPrinter orderPrinter = new HtmlPrinter();
        orderPrinter.printOrder(order, "1001.html");
    }

}
