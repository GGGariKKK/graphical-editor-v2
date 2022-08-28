package graphical.editor.v2.shape_displayers;

import graphical.editor.v2.shapes.Shape;

public class ShapeNameConsoleDisplayer implements ShapeConsoleDisplayer {

    private static final ShapeNameConsoleDisplayer instance = new ShapeNameConsoleDisplayer();

    private ShapeNameConsoleDisplayer() {

    }

    public static ShapeNameConsoleDisplayer getInstance() {
        return instance;
    }

    @Override
    public void display(Shape shape) {
        System.out.println("Shape with the name " + shape.getName());
    }
}
