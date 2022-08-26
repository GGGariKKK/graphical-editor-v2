package graphical.editor.v2.shapes.polygons;

public class Triangle extends Polygon {
    public Triangle(int xCoordinate, int yCoordinate, int sideA, int sideB, int sideC) {
        super(xCoordinate, yCoordinate, "Triangle", new int[]{sideA, sideB, sideC});
    }

    @Override
    public void display() {
        super.display();
        System.out.println("""
                              .
                           .-` :-
                        .-` .-` :
                     .-` .-` .: :
                  .-` .-` .-: : :
                -:  -: .-`  : : :
                : `-. `-.   : : :
                '-.  `-. '-.: : :
                   `-.  `-. : : :
                      `-.  `- : :
                         `-.  : :
                            `-:-`
                            
                            """);
    }

}
