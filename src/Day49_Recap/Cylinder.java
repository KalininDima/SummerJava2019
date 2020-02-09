package Day49_Recap;
/*
 WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
Formulas:
    Area of the circle:     3.14 * radius * radius
    Area of the rectangle:  width * length
    Area of the square:     side * side
    Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
    Perimeter of circle:    3.14 * 2 * radius
    Perimeter of rectangle: (width + length) * 2
    Perimeter of Square: 4 * side
    volume of cylinder: 3.14 * radius * radius * height .  
    
    
    override vs overload :
    		overload : same method name
    				   different parameter
    				   return-type can be same or different
    				   Access modifier can be same or different
    				   can happens in same class
    				   any method can be overloaded
    				   
    		override: same method name
    				  same parameter
    				  return type MUST be same
    				  access-modifier need to be same or more visible
    				  MUST be overloaded in sub class
    				  only the instance method can be override
    				  access-modifier cannot be private
    				  final method cannot be overridden
    				  @Override annotation must be applicable
    				  
    				   
 */
public class Cylinder extends Shape{
double radius;
double height;
final double PI = 3.14;
double diameter;

public Cylinder (double radius,double height) {
	this.radius = radius;
	this.height = height;
	diameter = radius*2;
}
@Override
protected void Area () {
	double Area = (1*PI*radius*radius)+(height*2*PI*radius);
	System.out.println("Area of the cylinder is "+Area);
}

@Override
protected void perimeter () {
	double perimiter = 2* (PI * diameter + height);
}

}
