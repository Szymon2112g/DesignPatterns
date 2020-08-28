package Structural.Composite;

import java.util.ArrayList;

// composite
public class CompositeGraphic implements Graphic {

    private final ArrayList<Graphic> childGraphics = new ArrayList<>();

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    @Override
    public void print() {
        for (Graphic graphic: childGraphics) {
            graphic.print();
        }
    }
}
