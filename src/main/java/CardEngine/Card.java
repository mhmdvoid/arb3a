package CardEngine;


// A signle card from the CardSet with its type; 
public class Card implements Comparable<Card> { 
    // TODO: it should be private, and generated not on demand.
    // for now, Will be generated on demand
    
    public enum CardColor { Club /*ةيريش*/, Diamond, Heart, Spade }

    public enum CardName { Seven, Eight, Nine, Ten, Jack, Queen, King, Ace }
    public CardColor Color;

    public CardName Name;
    public int Value;  // set card priority.

    public Card(CardName N) {
        Name = N;

    }

    protected Card(CardName N, CardColor C, int V) {
        Name = N;
        Color = C;
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
                "Type=" + Color +
                ", Name=" + Name +
                ", Value=" + Value +
                '}';
    }
}

