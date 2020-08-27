package Structural.Decorator;

// concrete decorator
public class HorizontalScrollDecorator extends WindowDecorator {

    public HorizontalScrollDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw() {
        drawHorizontalScrollBar();
        decoratedWindow.draw();
    }

    private void drawHorizontalScrollBar() {
        // do something
    }

    @Override
    public String getDescribe() {
        return decoratedWindow.getDescribe() + " with Horizontal scroll bar";
    }
}
