package Core;

import CardEngine.Card;

public class Player {

    // Every player has Right to كوشة
    String Name;
    Card[] CardSet; // CardSet is an object holds 8 cards no need to do things like Card[] !
    public boolean IsDealer;
    public char Identifier; // unique id;

    private static final int SET_SIZE = 8;
    Player TeamMember; // FIXME: self refernce.

    public Player(String N) {
        Name = N;
        CardSet = new Card[SET_SIZE];
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
