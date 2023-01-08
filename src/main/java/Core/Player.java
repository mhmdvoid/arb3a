package Core;

import CardEngine.Card;
import CardEngine.CardSet;

import java.util.ArrayList;

// this is like the team;
// Every team is composed of a current_player and a team_member;
public class Player {

    // Every player has Right to كوشة
    String Name;
    CardSet CardSet; // CardSet is an object holds 8 cards.
    public boolean IsDealer;
    public char Identifier; // unique id;

    private static final int SET_SIZE = 8;
    Player TeamMember; // FIXME: self refernce.
    ArrayList<Card> EatenCards; // During the game;
    Project[] projects = new Project[2]; // each player either serar and sera, 50, 50 m 50,serra 100 and serra;

    boolean IsBuyer; // The team buying?
    public Player(String N) {
        Name = N;
        CardSet = new CardSet();
        // CardGenerator.Kick(this.CardSet, /*Initial*/ true);
        // if player buys a round CardSet.length == 8, else == 5
    }

    @Override
    public String toString() {
        return "Player{" +
                "Name='" + Name + '\'' +
                "ID_INSIDE_ROOM=" + Identifier + '\'' +
                '}';
    }
}
