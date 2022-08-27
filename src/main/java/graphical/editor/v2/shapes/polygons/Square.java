package graphical.editor.v2.shapes.polygons;

public class Square extends Polygon {
    public Square(int xCoordinate, int yCoordinate, int side) {
        super(xCoordinate, yCoordinate, "Square", """ 
                         ______________
                        |              |
                        |              |
                        |              |
                        |______________|
                        
                        """,  new int[]{side, side, side, side});
    }
}
