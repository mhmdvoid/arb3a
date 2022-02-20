package CardEngine;


// A signle card from the CardSet with its type; 
public class Card { 
    // TODO: it should be private, and generated not on demand.
    // for now, Will be generated on demand
    
    enum CardType { Club /*ةيريش*/, Diamond, Heart, Spade }

    CardType Type;

    public Card(CardType T) { Type = T; }
}

