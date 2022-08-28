package graphical.editor.v2;

import graphical.editor.v2.shape_displayers.ShapeDrawingConsoleDisplayer;
import graphical.editor.v2.shape_displayers.ShapeNameConsoleDisplayer;
import graphical.editor.v2.shapes.Circle;
import graphical.editor.v2.shapes.Ellipse;
import graphical.editor.v2.shapes.polygons.Rectangle;
import graphical.editor.v2.shapes.polygons.Square;
import graphical.editor.v2.shapes.polygons.Triangle;

import java.util.Random;

public class ShapeTest {

    public static Random rand = new Random();

    public static void main(String[] args) {

        ShapeNameConsoleDisplayer.getInstance().display(new Rectangle(rand(), rand(), rand(), rand()));
        ShapeNameConsoleDisplayer.getInstance().display(new Square(rand(), rand(), rand()));
        ShapeNameConsoleDisplayer.getInstance().display(new Triangle(rand(), rand(), rand(), rand(), rand()));
        ShapeNameConsoleDisplayer.getInstance().display(new Circle(rand(), rand()));
        ShapeNameConsoleDisplayer.getInstance().display(new Ellipse(rand(), rand()));


        ShapeDrawingConsoleDisplayer.getInstance().display(new Rectangle(rand(), rand(), rand(), rand()));
        ShapeDrawingConsoleDisplayer.getInstance().display(new Square(rand(), rand(), rand()));
        ShapeDrawingConsoleDisplayer.getInstance().display(new Triangle(rand(), rand(), rand(), rand(), rand()));
        ShapeDrawingConsoleDisplayer.getInstance().display(new Circle(rand(), rand()));
        ShapeDrawingConsoleDisplayer.getInstance().display(new Ellipse(rand(), rand()));
    }

    public static int rand() {
        return rand.nextInt(0, 51);
    }
}
