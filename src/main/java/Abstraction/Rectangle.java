package Abstraction;

public class Rectangle extends Shape {

    double width ;
    double height ;
    public Rectangle( String color , double width , double height){
        super(color);
        System.out.println("Rectangle Contructor is called");
        this.height = height ;
        this.width = width ;

    }

    public double area(){
        return width * height ;
    }

    public String toString(){
        return "Color of tha shape is " +getColor() + " It's area is " +area();
    }

}
