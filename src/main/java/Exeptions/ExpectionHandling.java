package Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpectionHandling {
    public static void main(String[] args) throws IOException {
//        createNewFile();
//        multipleExptions();
        createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile() ;
        }catch (IOException e ){
            System.out.println("Directory doesn't exist");
            e.printStackTrace();
        }
    }
    //////////////////////////////////////////////////////////////////////////////////
    public static void multipleExptions(){
        File file = new File("resources/nonexistent.txt");
        Scanner fileReader = null ;
        try {
             fileReader = new Scanner(file) ;
            while (fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }

        }catch (FileNotFoundException | InputMismatchException e){
            System.out.println("TT");
            e.printStackTrace();
        }finally {
            fileReader.close();
        }

    }
    //////////////////////////////////////////////////////////////////////////////////
    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt") ;
        file.createNewFile() ;
    }

}
