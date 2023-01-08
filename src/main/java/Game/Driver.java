package Game;

import Core.Player;
import Core.RoomPool;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        //  Heavy refactor should go here as well !.
        System.out.println("... Hello to Arb3a ...");

        System.out.println("Assume we have 6 players ");
        var i = 0;
        while (i++ < 6) {
            System.out.println("Please sign in to play");
            var KeyboardIn = new Scanner(System.in);
            var PlayerName = KeyboardIn.nextLine();
            var Player = new Player(PlayerName);
            Game.Play();
        }
        RoomPool.Shared().Dump();// Memory-leaks?

    }
}

