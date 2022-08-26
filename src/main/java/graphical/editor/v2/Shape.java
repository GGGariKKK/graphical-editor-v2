package graphical.editor.v2;

public abstract class Shape implements Displayable{
    protected int xCoordinate;
    protected int yCoordinate;
    protected String name;

    public Shape(int xCoordinate, int yCoordinate, String name) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.name = name;
    }

}
