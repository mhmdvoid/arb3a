package Core;


import CardEngine.Card;

// This is like the context table for current room
// Things like: Table.PlayedCards, Table.CurrentGame, etc..
public class Table {

    Room TheRoom;

    public static boolean GenerateDealer() {
        return true;
    }

    public static Card.CardType CurrentGame() {
        // if controlPlayer plays Diamond, this should return CurrentGame == Diamond.
        return null;
    }

}
