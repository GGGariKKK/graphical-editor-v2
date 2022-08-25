package graphical.editor.v2;

public abstract class Shape implements Displayable{
    private int xCoordinate;
    private int yCoordinate;
    private Color outlineColor;
    private Color fillColor;

    public Shape(int xCoordinate, int yCoordinate, Color outlineColor, Color fillColor) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.outlineColor = outlineColor;
        this.fillColor = fillColor;
    }
}
