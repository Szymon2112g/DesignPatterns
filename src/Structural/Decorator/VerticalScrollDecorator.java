package Structural.Decorator;

// concrete decorator
public class VerticalScrollDecorator extends WindowDecorator {

    public VerticalScrollDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw() {
        drawVerticalScrollBar();
        decoratedWindow.draw();
    }

    private void drawVerticalScrollBar() {
        // do something
    }

    @Override
    public String getDescribe() {
        return decoratedWindow.getDescribe() + " with Vertical scroll bar";
    }
}
