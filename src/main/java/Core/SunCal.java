package Core;

import CardEngine.Card;

import java.util.List;

public class SunCal extends Arb3aCalculator {
    enum SunResult {
        Success, Lose, Kaboot;
    }

    final int SUN_MAX = 130;

    public SunCal(GameType T) {
        super(T);
    }

    // Trivial parsing.
    // FIXME: we should parse based on projects + counts.
    SunResult calculate(List<Card> cards) {

        // A track of number of projects + suplemnets to reaching 65 ;
        // complement of 65 so the project tracker should
        // We should be as abstract as possible;
        if (cards.isEmpty()) {
            return SunResult.Kaboot;  // and this is different from 0 count;
        }
        int count = 0;
        var iter = cards.iterator();
        while (iter.hasNext()) {
            var currentCard = iter.next();
            switch (currentCard.Name) {
                case Ace -> count += 11;
                case Ten -> count += 10;
                case King -> count += 4;
                case Queen -> count += 3;
                case Jack -> count += 2;
            }
        }
        // we should count the team opponent not the buyer, i.e;
        // result should be buyer notification
        if (count >= 65) {
            return SunResult.Lose;
        }

        return SunResult.Success;
        // now count should be smthing;
    }

}
