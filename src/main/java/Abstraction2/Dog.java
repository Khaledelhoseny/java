package Abstraction2;

public class Dog extends Animal {
    public Dog( String name ){
        super("Fluffy");

    }
    @Override
    public void makeSound() {
        System.out.println( getName() +" Barks");
    }

//    @Override
//    public String getName() {
//        return name ;
//    }
}
