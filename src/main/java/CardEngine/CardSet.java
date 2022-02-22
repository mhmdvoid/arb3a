package CardEngine;
class ArrayOf8<T extends Comparable> {

   // data structure
   private T[] ValuesOf_8;

   private int Ptr;
   public static final int SIZE = 8;
   public ArrayOf8() {

      ValuesOf_8 = (T[]) new Comparable[8];
   }  


   public boolean Append(T Val) {
       if (Ptr > 8) { return false; }
       ValuesOf_8[Ptr++] = Val;
       return true;
   }
}


abstract class Suit { 
    public abstract ArrayOf8<Card> ExecSet();


}
class Club extends Suit {

    @Override 
    public ArrayOf8<Card> ExecSet() {
        

        // This is trivial and should be abstract away.
        var ClubType = Card.CardType.Club;
        var Val = 1;
        var Cards = new ArrayOf8<Card>(); // Create a single reference; to create and return that's expensive;
        while (Cards.Append(new Card(ClubType, Val++))) {} 
                
        return Cards; 
    
    }
}
class Diamond extends Suit {
    
    @Override 
    public ArrayOf8<Card> ExecSet() {return null; }
}
class Heart extends Suit {
    
    @Override 
    public ArrayOf8<Card> ExecSet() {return null; }
}
class Spade extends Suit {

    @Override 
    public ArrayOf8<Card> ExecSet() {return null; }
} 


public class CardSet {

    // infere the info
    // from card data structure;
    // card generator;
    // will infere this info and 
    // generate on denmand;
    // on demand will be the round
    //


    private Card[/*32*/] CardStorage;

    private CardSet() {};
    public final void FillSet() {

        /* We have 4 suites; for each suit there's a 7-A cards So we could hand*/


    }

}
