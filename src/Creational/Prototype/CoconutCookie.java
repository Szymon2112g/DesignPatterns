package Creational.Prototype;

// prototype
public class CoconutCookie extends Cookie {

    private int amountOfCoconut;

    public CoconutCookie(String name, int amountOfCoconut) {
        super(name);
        this.amountOfCoconut = amountOfCoconut;
    }

    @Override
    protected CoconutCookie clone() throws CloneNotSupportedException {
        try {
            CoconutCookie cookie = (CoconutCookie)super.clone();
            return cookie;
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getAmountOfCoconut() {
        return amountOfCoconut;
    }

    public void setAmountOfCoconut(int amountOfCoconut) {
        this.amountOfCoconut = amountOfCoconut;
    }

    @Override
    public String toString() {
        return "CoconutCookie{" +
                "amountOfCoconut=" + amountOfCoconut +
                '}';
    }
}
