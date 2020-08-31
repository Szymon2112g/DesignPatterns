package Behavioral.Visitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}
