package graphical.editor.v2.shapes.polygons;

public class Rectangle extends Polygon {
    public Rectangle(int xCoordinate, int yCoordinate, int sideA, int sideB) {
        super(xCoordinate, yCoordinate, "Rectangle", new int[]{sideA, sideB, sideA, sideB});
    }

    @Override
    public void display() {
        super.display();
        System.out.println(""" 
                 __________________________
                |                          |
                |                          |
                |                          |
                |__________________________|
                
                """);
    }
}
