package Creational.Prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        CoconutCookie coconutCookie = new CoconutCookie("coconut", 20);
        System.out.println(coconutCookie.toString());

        CoconutCookie copy = coconutCookie.clone();
        System.out.println(copy.toString());

        MysteriousCookie mysteriousCookie = new MysteriousCookie("mysterious", 2);
        System.out.println(mysteriousCookie.toString());

        MysteriousCookie copy2 = mysteriousCookie.clone();
        System.out.println(copy2);

    }
}
