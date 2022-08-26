package graphical.editor.v2.shapes.polygons;

import graphical.editor.v2.Shape;

import java.util.Arrays;

public abstract class Polygon extends Shape {
    protected int[] sides;

    public Polygon(int xCoordinate, int yCoordinate, String name, int[] sides) {
        super(xCoordinate, yCoordinate, name);
        this.sides = sides;
    }

    @Override
    public void display() {
        System.out.printf("Shape %s with coordinates (%d, %d) and sides: %s\n", super.name, super.xCoordinate, super.yCoordinate, Arrays.toString(sides));
    }
}
