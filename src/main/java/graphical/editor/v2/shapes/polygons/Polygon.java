package graphical.editor.v2.shapes.polygons;

import graphical.editor.v2.Shape;

public abstract class Polygon extends Shape {
    protected int[] sides;

    public Polygon(int xCoordinate, int yCoordinate, String name, int[] sides) {
        super(xCoordinate, yCoordinate, name);
        this.sides = sides;
    }
}
