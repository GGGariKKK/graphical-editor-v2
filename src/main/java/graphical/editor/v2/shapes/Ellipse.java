package graphical.editor.v2.shapes;

import graphical.editor.v2.Shape;

public class Ellipse extends Shape {
    public Ellipse(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, "Ellipse");
    }

    @Override
    public void display() {
        System.out.printf("Shape %s with coordinates (%d, %d)\n", super.name, super.xCoordinate, super.yCoordinate);
        System.out.println("""
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
                            
                            """);
    }
}
