package graphical.editor.v2.shapes.polygons;

public class Rectangle extends Polygon {
    public Rectangle(int xCoordinate, int yCoordinate, int sideA, int sideB) {
        super(xCoordinate, yCoordinate, "Rectangle", """ 
                 __________________________
                |                          |
                |                          |
                |                          |
                |__________________________|
                
                """, new int[]{sideA, sideB, sideA, sideB});
    }
}
