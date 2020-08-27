package Structural.Adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }

}
