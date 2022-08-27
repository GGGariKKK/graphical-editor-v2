package graphical.editor.v2;

public abstract class Shape {
    protected int xCoordinate;
    protected int yCoordinate;
    protected String name;

    protected String graphicalRepresentation;

    public Shape(int xCoordinate, int yCoordinate, String name, String graphicalRepresentation) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.name = name;
        this.graphicalRepresentation = graphicalRepresentation;
    }

    public String getName() {
        return name;
    }

    public String getGraphicalRepresentation() {
        return graphicalRepresentation;
    }
}
