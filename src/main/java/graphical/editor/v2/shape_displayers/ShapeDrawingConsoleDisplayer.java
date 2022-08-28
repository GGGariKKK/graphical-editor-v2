package graphical.editor.v2.shape_displayers;

import graphical.editor.v2.shapes.Shape;

public class ShapeDrawingConsoleDisplayer implements ShapeConsoleDisplayer {

    private static final ShapeDrawingConsoleDisplayer instance = new ShapeDrawingConsoleDisplayer();

    private ShapeDrawingConsoleDisplayer(){

    }

    public static ShapeDrawingConsoleDisplayer getInstance(){
        return instance;
    }

    @Override
    public void display(Shape shape) {
        System.out.println(shape.getGraphicalRepresentation());
    }
}
