package graphical.editor.v2.shapes;

import graphical.editor.v2.Shape;

public class Circle extends Shape {
    public Circle(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, "Circle");
    }

    @Override
    public void display() {
        System.out.printf("Shape %s with coordinates (%d, %d)\n", super.name, super.xCoordinate, super.yCoordinate);
        System.out.println("""
                        , - ~ ~ ~ - ,
                    , '               ' ,
                  ,                       ,
                 ,                         ,
                ,                           ,
                ,                           ,
                ,                           ,
                 ,                         ,
                  ,                       ,
                    ,                   ,
                      ' - , _ _ _ , - '
                      
                      
                      """);
    }
}
