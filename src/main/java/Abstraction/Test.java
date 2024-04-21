package Abstraction;

import io.opentelemetry.api.trace.Span;

public class Test {
    public static void main(String[] args) {
        Shape obj = new Circle("Red" , 2 ) ;
        System.out.println(obj.toString());


        Shape obj2 = new Rectangle("Blue" , 2 , 2 ) ;
        System.out.println(obj2.toString()) ;

    }
}
