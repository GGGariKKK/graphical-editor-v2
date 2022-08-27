package graphical.editor.v2;

public class ShapeDrawingConsoleDisplayer implements ShapeConsoleDisplayer {

    private final Shape shape;

    public ShapeDrawingConsoleDisplayer(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void display() {
        System.out.println(shape.getGraphicalRepresentation());
    }
}
