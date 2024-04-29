import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter User Name");
        String name  = scn.next() ;

        System.out.println("Your name is " + name );

    }
}
