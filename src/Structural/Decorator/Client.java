package Structural.Decorator;

public class Client {

    public static void main(String[] args) {

        Window decoratedWindow = new HorizontalScrollDecorator(
                new VerticalScrollDecorator(new OrdinaryWindow())
        );

        System.out.println(decoratedWindow.getDescribe());
    }
}
