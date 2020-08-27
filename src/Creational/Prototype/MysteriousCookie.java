package Creational.Prototype;

// prototype
// doesn't support cloning
public class MysteriousCookie extends Cookie {

    private int something;

    public MysteriousCookie(String name, int something) {
        super(name);
        this.something = something;
    }

    @Override
    protected MysteriousCookie clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("It is mystery");
    }

    public int getSomething() {
        return something;
    }

    public void setSomething(int something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "MysteriousCookie{" +
                "something=" + something +
                '}';
    }
}
