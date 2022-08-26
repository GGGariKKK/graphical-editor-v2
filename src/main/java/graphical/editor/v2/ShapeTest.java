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
        System.out.println("Displaying through Displayable interface:\n");

        Displayable rectangle1 = new Rectangle(rand(), rand(), rand(), rand());
        rectangle1.display();

        Displayable someShape1 = new Square(rand(), rand(), rand());
        someShape1.display();

        someShape1 = new Triangle(rand(), rand(), rand(), rand(), rand());
        someShape1.display();

        someShape1 = new Ellipse(rand(), rand());
        someShape1.display();

        someShape1 = new Circle(rand(), rand());
        someShape1.display();


        //Or the same output using Shape class(Not wise because to display all the shapes it is sufficient to use the interface as was done above)

        System.out.println("\n\nUsing shape classes:\n");

        Shape rectangle2 = new Rectangle(rand(), rand(), rand(), rand());
        rectangle2.display();

        Shape someShape2 = new Square(rand(), rand(), rand());
        someShape2.display();

        someShape2 = new Triangle(rand(), rand(), rand(), rand(), rand());
        someShape2.display();

        someShape2 = new Ellipse(rand(), rand());
        someShape2.display();

        someShape2 = new Circle(rand(), rand());
        someShape2.display();

    }

    public static int rand(){
        return rand.nextInt(0, 51);
    }
}
