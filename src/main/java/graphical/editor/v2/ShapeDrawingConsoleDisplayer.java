package graphical.editor.v2;

import graphical.editor.v2.shapes.Circle;
import graphical.editor.v2.shapes.Ellipse;
import graphical.editor.v2.shapes.polygons.Rectangle;
import graphical.editor.v2.shapes.polygons.Square;
import graphical.editor.v2.shapes.polygons.Triangle;

public class ShapeDrawingConsoleDisplayer implements ShapeConsoleDisplayer {

    private final Shape shape;

    public ShapeDrawingConsoleDisplayer(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void display() {
        String graphicalRepresentation = switch (shape){
            case Rectangle r -> """ 
                 __________________________
                |                          |
                |                          |
                |                          |
                |__________________________|
                
                """;
            case Square s -> """ 
                         ______________
                        |              |
                        |              |
                        |              |
                        |______________|
                        
                        """;
            case Triangle t -> """
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
                            
                            """;
            case Circle c -> """
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
                      
                      
                      """;
            case Ellipse e -> """
                            ....................                              
                    ........                    ........                        
              ......                                    ......                  
        ......                                                ......            
      ..                                                            ..          
    ..                                                                ..        
  ..                                                                    ..      
  ..                                                                    .. 
  ..                                                                    ..
  ..                                                                    ..  
    ..                                                                ..        
      ..                                                            ..    
        ......                                                ......  
              ......                                    ......            
                    ........                    ........            
                            ....................  
                            
                            """;
            default -> "Graphical representation of the shape " + shape.getClass().getSimpleName() + " is not supported";
        };
        System.out.println(graphicalRepresentation);
    }
}
