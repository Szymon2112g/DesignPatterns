package Structural.Composite;

public class Client {

    public static void main(String[] args) {

        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic compositeGraphic1 = new CompositeGraphic();
        compositeGraphic1.add(ellipse1);
        compositeGraphic1.add(ellipse2);
        compositeGraphic1.add(ellipse3);

        CompositeGraphic compositeGraphic2 = new CompositeGraphic();
        compositeGraphic2.add(ellipse4);

        CompositeGraphic compositeGraphic3 = new CompositeGraphic();
        compositeGraphic3.add(compositeGraphic1);
        compositeGraphic3.add(compositeGraphic2);

        compositeGraphic3.print();
    }
}
