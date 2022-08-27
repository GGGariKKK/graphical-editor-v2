package graphical.editor.v2;

public class ShapeNameConsoleDisplayer implements ShapeConsoleDisplayer {

    private final Shape shape;

    public ShapeNameConsoleDisplayer(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void display() {
        System.out.println("Shape with the name " + shape.getName());
    }
}
