package CardEngine;


// A signle card from the CardSet with its type; 
public class Card { 
    // TODO: it should be private, and generated not on demand.
    // for now, Will be generated on demand
    
    public enum CardType { Club /*ةيريش*/, Diamond, Heart, Spade }

    CardType Type;

    byte Value;  // set card priority.

    private Card(CardType T, byte V) {
        Type = T;
        Value = V;
    }


}

