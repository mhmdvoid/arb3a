package Game;

import CardEngine.CardSet;

public class Driver {
    public static void main(String[] args) {

        // Test out;
        var it = CardSet.Own().GetCards().iterator();

        while (it.HasNext()) {
            var TheCard = it.Next();
            System.out.println(TheCard);
        }

    }
}

