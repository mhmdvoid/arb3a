package CardEngine;


// A signle card from the CardSet with its type; 
public class Card implements Comparable<Card> { 
    // TODO: it should be private, and generated not on demand.
    // for now, Will be generated on demand
    
    public enum CardType { Club /*ةيريش*/, Diamond, Heart, Spade }

    public enum CardName { Seven, Eight, Nine, Ten, Jack, Queen, King, Ace }
    CardType Type;

    CardName Name;
    public int Value;  // set card priority.

    protected Card(CardName N, CardType T, int V) {
        Name = N;
        Type = T;
        Value = V;
    }

    @Override 
    public int compareTo(Card Other) {

        var result = this.Value > Other.Value ? 1 : -1;
        if (Other.Value == this.Value) { result = 0; }
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Type=" + Type +
                ", Name=" + Name +
                ", Value=" + Value +
                '}';
    }
}

