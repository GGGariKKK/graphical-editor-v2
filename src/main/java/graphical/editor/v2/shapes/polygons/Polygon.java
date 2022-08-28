package graphical.editor.v2.shapes.polygons;

import graphical.editor.v2.shapes.Shape;

public abstract class Polygon extends Shape {
    protected int[] sides;

    public Polygon(int xCoordinate, int yCoordinate, String name, String graphicalRepresentation, int[] sides) {
        super(xCoordinate, yCoordinate, name, graphicalRepresentation);
        this.sides = sides;
    }
}
