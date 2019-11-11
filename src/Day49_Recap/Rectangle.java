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
 */
public class Rectangle extends Shape {
 double length;
 double width;
 
 public Rectangle (double length,double width) {
	 this.length = length;
	 this.width = width;
 }
 @Override
 protected void Area() {
	 double Area = length*width;
	 System.out.println("Area is "+Area);
	 
 }
 
 @Override
 protected void perimiter() {
	 double perimiter = (length+width)* 2;
	 System.out.println("Perimiter of the rectangle is "+perimiter);
 }
 
 
 
 
}
