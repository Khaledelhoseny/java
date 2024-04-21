package Abstraction;

public class Circle extends Shape {
     double radious ;

    public Circle(String color , double radious){
        super(color);
        System.out.println("Circle Constructor is called");
        this.radious = radious ;
    }
    @Override
     double area(){
        return Math.PI * Math.pow(radious, 2);
    }
    @Override
    public String toString(){
        return "Color of tha shape is " +getColor() + " It's area is " +area();
    }

}
