package graphical.editor.v2.shapes.polygons;

public class Square extends Polygon {
    public Square(int xCoordinate, int yCoordinate, int side) {
        super(xCoordinate, yCoordinate, "Square", new int[]{side, side, side, side});
    }

    @Override
    public void display() {
        super.display();
        System.out.println(""" 
                         ______________
                        |              |
                        |              |
                        |              |
                        |______________|
                        
                        """);
    }
}
