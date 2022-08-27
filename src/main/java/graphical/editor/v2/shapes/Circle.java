package graphical.editor.v2.shapes;

import graphical.editor.v2.Shape;

public class Circle extends Shape {
    public Circle(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, "Circle", """
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
