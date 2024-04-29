package Coin;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
        Player player1 = new Player(game.askPlayerName()) ;
        game.userGuess() ;


    }

    public String askPlayerName(){
        System.out.println("Enter your name");
        Scanner scn = new Scanner(System.in) ;
        String name = scn.next();
        return name ;

    }

    public String userGuess(){
        System.out.println("What is your guess");
        Scanner scn = new Scanner(System.in) ;
        String guess = scn.next();
        while (!guess.equalsIgnoreCase(CoinClass.HEADS) && !guess.equalsIgnoreCase(CoinClass.TAILS)  ){
            System.out.println("Please guess again");
            guess = scn.next();
        }
        return guess ;


    }
}
