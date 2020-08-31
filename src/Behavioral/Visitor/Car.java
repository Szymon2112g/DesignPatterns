package Behavioral.Visitor;

import java.util.List;

public class Car implements CarElement {

    private final List<CarElement> carElementList;

    public Car() {
        this.carElementList = List.of(
                new Wheel("front left"), new Wheel("front right"),
                new Wheel("back left"), new Wheel("back right"),
                new Body(), new Engine()
        );
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for(CarElement carElement: carElementList) {
            carElement.accept(visitor);
        }

        visitor.visit(this);
    }
}
