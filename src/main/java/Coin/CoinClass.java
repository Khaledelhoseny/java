package Coin;

public class CoinClass {
    private String side ;
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";

    public void flip(){

        boolean rand = Math.random() < 0.5;
        System.out.println(rand);
        if (rand){
            this.side = HEADS ;
        }else {
            this.side = TAILS ;
        }

    }

    public static void main(String[] args) {
        CoinClass obj = new CoinClass() ;
        obj.flip();
        System.out.println(obj.side);
    }
}
