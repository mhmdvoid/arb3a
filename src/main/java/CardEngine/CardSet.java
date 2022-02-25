package CardEngine;
class ArrayOf32<T extends Comparable> {

   // data structure
   private T[] ValuesOf_32;

   private int Ptr;
   public static final int SIZE = 32;
   public ArrayOf32() {

      ValuesOf_32 = (T[]) new Comparable[32];
   }  


   public boolean Append(T Val) {
       if (Ptr > 32) { return false; }
       ValuesOf_32[Ptr++] = Val;
       return true;
   }
}


// This should represent the cardSet;
abstract class Suit implements Comparable<Suit> {

    protected Suit() {
    }

    public abstract void ExecSet(ArrayOf32<Card> Cards);

    public Card.CardName Parse_CardName(int WithVal) {

        switch (WithVal) {
            case 1 -> { return Card.CardName.Seven; }
            case 2 -> {  return Card.CardName.Eight ;}
            case 3 -> {  return Card.CardName.Nine;}
            case 4 -> {  return Card.CardName.Ten;}
            case 5 -> {  return Card.CardName.Jack;}
            case 6 -> {  return Card.CardName.Queen ;}  
            case 7 -> { return Card.CardName.King ;}
            default -> { return null; }
        }
    }
}

class Club extends Suit {


    @Override
    public void ExecSet(ArrayOf32<Card> Cards) {
        // TODO: Wierd implementation !
        var i = 0;
        while (i++ < 8) { Cards.Append(new Card(Parse_CardName(i), Card.CardType.Club, i)); }

    }

    @Override
    public int compareTo(Suit o) {
        assert o instanceof Club;
        var ClubOther = (Club) o;
        return 0;
    }
}
class Diamond extends Suit {

    @Override
    public void ExecSet(ArrayOf32<Card> Cards) {
        var i = 0;
        while (i++ < 8) { Cards.Append(new Card(Parse_CardName(i),Card.CardType.Diamond, i)); }


    }

    @Override
    public int compareTo(Suit o) {
        return 0;
    }
}
class Heart extends Suit {

    @Override
    public void ExecSet(ArrayOf32<Card> Cards) {
        var i = 0;
        while (i++ < 8) { Cards.Append(new Card(Parse_CardName(i),Card.CardType.Heart, i)); }
    }

    @Override
    public int compareTo(Suit o) {
        return 0;
    }
}
class Spade extends Suit {

    @Override
    public void ExecSet(ArrayOf32<Card> Cards) {
        var i = 0;
        while (i++ < 8) { Cards.Append(new Card(Parse_CardName(i),Card.CardType.Spade, i)); }
    }

    @Override
    public int compareTo(Suit o) {
        return 0;
    }
}



// A single card set.
public class CardSet {
//
//    // this is the static set !;
//    // infere the info
//    // from card data structure;
//    // card generator;
//    // will infere this info and
//    // generate on denmand;
//    // on demand will be the round
//    //
//
    private final ArrayOf32<Card> Cards = new ArrayOf32<>();
    private static CardSet instance;


    private CardSet() {
        Fill();
    }

    public static CardSet Own() {
        if (instance == null) { instance = new CardSet(); }
        return instance;
    }

    public void Fill() {
        // Fill is the important part here;
        var ClubObj = new Club();
        var Heart = new Heart();
        var Dia = new Diamond();
        var Spa = new Spade();

        ClubObj.ExecSet(this.Cards);
        Heart.ExecSet(this.Cards);
        Dia.ExecSet(this.Cards);
        Spa.ExecSet(this.Cards);
    }
//
//    private CardSet() {};
//    public final void FillSet() {
//
//        // TODO: Use a visitor CardSet;
//
//
//    }
//
}