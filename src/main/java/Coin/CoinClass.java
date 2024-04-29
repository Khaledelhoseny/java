package Coin;

public class CoinClass {
    private String side ;
    final String head = "Head" ;
    final String tail = "Tail" ;

    public void flip(){

        boolean rand = Math.random() < 0.5;
        System.out.println(rand);
        if (rand){
            this.side = head ;
        }else {
            this.side = tail ;
        }

    }

    public static void main(String[] args) {
        CoinClass obj = new CoinClass() ;
        obj.flip();
        System.out.println(obj.side);
    }
}
