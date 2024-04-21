package Abstraction2;

abstract class Animal {

    public String name ;
    public Animal(String name){
        this.name =  name ;
    }
    public abstract void makeSound();
//    public abstract String getName();
    public String getName(){
        return name ;
    }

}
