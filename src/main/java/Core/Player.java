package Core;

import CardEngine.Card;

public class Player {

    String Name; 
    Card[] CardSet;


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
                '}';
    }
}
