package Game;

import Core.Player;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        System.out.println("... Hello to Arb3a ...");

        System.out.println("Please sign in to play");
        var KeyboardIn = new Scanner(System.in);
        var PlayerName = KeyboardIn.nextLine();
        var Player = new Player(PlayerName);

//        System.out.println("Please Press Play to start off");

        Player.Play();


        // Test out;
//        var it = CardSet.Own().GetCards().iterator();
//
//        while (it.HasNext()) {
//            var TheCard = it.Next();
//            System.out.println(TheCard);
//        }

    }
}

