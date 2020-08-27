package Creational.Prototype;


// abstract prototype
public abstract class Cookie implements Cloneable {

    private String name;

    public Cookie() {
        this.name = "";
    }

    public Cookie(String name) {
        this.name = name;
    }

    @Override
    protected Cookie clone() throws CloneNotSupportedException {
        try {
            Cookie cookie = (Cookie)super.clone();
            return cookie;
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "name='" + name + '\'' +
                '}';
    }
}
