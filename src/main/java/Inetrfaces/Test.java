package Inetrfaces;

public class Test {
    public static void main(String[] args) {
        Bicycle obj = new Bicycle() ;
        obj.changeGear(2);
        obj.speedUp(3);
        obj.applyBreaks(1);
        obj.printState();
    }
}
