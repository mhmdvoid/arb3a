package CardEngine;


// A signle card from the CardSet with its type; 
public class Card implements Comparable<Card> { 
    // TODO: it should be private, and generated not on demand.
    // for now, Will be generated on demand
    
    public enum CardType { Club /*ةيريش*/, Diamond, Heart, Spade }

    CardType Type;

    public int Value;  // set card priority.

    protected Card(CardType T, int V) {
        Type = T;
        Value = V;
    }

    @Override 
    public int compareTo(Card Other) {

        var result = this.Value > Other.Value ? 1 : -1;
        if (Other.Value == this.Value) { result = 0; }
        return result;
    }

}

