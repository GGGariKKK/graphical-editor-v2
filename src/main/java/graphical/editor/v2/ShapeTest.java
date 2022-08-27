package graphical.editor.v2;

import graphical.editor.v2.shapes.Circle;
import graphical.editor.v2.shapes.Ellipse;
import graphical.editor.v2.shapes.polygons.Rectangle;
import graphical.editor.v2.shapes.polygons.Square;
import graphical.editor.v2.shapes.polygons.Triangle;

import java.util.Random;

public class ShapeTest {

    public static Random rand = new Random();

    public static void main(String[] args) {

        ShapeConsoleDisplayer nameDisplayer;

        nameDisplayer = new ShapeNameConsoleDisplayer(new Rectangle(rand(), rand(), rand(), rand()));
        nameDisplayer.display();

        nameDisplayer = new ShapeNameConsoleDisplayer(new Square(rand(), rand(), rand()));
        nameDisplayer.display();

        nameDisplayer = new ShapeNameConsoleDisplayer(new Triangle(rand(), rand(), rand(), rand(), rand()));
        nameDisplayer.display();

        nameDisplayer = new ShapeNameConsoleDisplayer(new Circle(rand(), rand()));
        nameDisplayer.display();

        nameDisplayer = new ShapeNameConsoleDisplayer(new Ellipse(rand(), rand()));
        nameDisplayer.display();


        ShapeConsoleDisplayer drawingDisplayer;

        drawingDisplayer = new ShapeDrawingConsoleDisplayer(new Rectangle(rand(), rand(), rand(), rand()));
        drawingDisplayer.display();

        drawingDisplayer = new ShapeDrawingConsoleDisplayer(new Square(rand(), rand(), rand()));
        drawingDisplayer.display();

        drawingDisplayer = new ShapeDrawingConsoleDisplayer(new Triangle(rand(), rand(), rand(), rand(), rand()));
        drawingDisplayer.display();

        drawingDisplayer = new ShapeDrawingConsoleDisplayer(new Circle(rand(), rand()));
        drawingDisplayer.display();

        drawingDisplayer = new ShapeDrawingConsoleDisplayer(new Ellipse(rand(), rand()));
        drawingDisplayer.display();
    }

    public static int rand(){
        return rand.nextInt(0, 51);
    }
}
