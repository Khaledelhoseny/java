package Inetrfaces;

public class Bicycle implements Vehicle {
    private   int gear ;
    private int speed ;
    @Override
    public void changeGear(int newGear ) {
        gear = newGear  ;
    }
    @Override
    public void speedUp(int increment ) {
        speed = increment  ;
    }
    @Override
    public void applyBreaks(int decrement ) {
        speed = speed - decrement  ;
    }

    public void printState(){
        System.out.println( "Speed : " +speed+ " gear : "+ gear );
    }


}
