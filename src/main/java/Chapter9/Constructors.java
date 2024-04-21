package Chapter9;

public class Constructors {

    String name ;
    int age ;
    public Constructors( String name , int age ){
        this.name = name ;
        this.age = age ;
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors("khaled", 23) ;
        System.out.println("name: "+ obj.name+" age: "+obj.age);

    }


}
