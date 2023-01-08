package Core;

import CardEngine.Card;
public class Fifty extends Project {


    final int CARDs_NUMBER = 4;
    public Fifty() {
        super(ProjectType.Fifty_);
    }

    ProjectResult validateFifty(Card[] Cards) {


        var CurrentColor = Cards[0];
        // assume it's Diamond;
        var projectTracker = 1; // will act like the sequence;
        for (int i = 0; i < Cards.length; i++) {
            var next = i + 1; // NOTE: Always assumption cards.length == 8;
            if (parse(CurrentColor, Cards[next])) {
                // check before reset the projectTracker if it;s 3 you have serra with
                projectTracker = 1;
                continue;
            }
            projectTracker++;
        }


        // int i = 0;
        // while (true) {
        //     Card Current = Cards[i++];
        //     switch (Current.Color) {
        //         case Diamond -> {
        //             int next = i; // will be 1 for sure for sure;
        //             projectTracker = 1;   // this should be changed once we get out of color;

        //             // it seems for me this is a general algoritherm;
        //             // do the logic you're looking for
        //             // say it's seven of even Queen;
        //             // current will be either the seven or the queen and check and go up higher;
        //             // are current and next seq? yes keep going how do you know? parse, i.t match 7, 10, jack, queen;
        //             // start at 1, ++ = 2 3, Sera perfectly; until diamond;
        //         }
        //     }
        // }

        return ProjectResult.Unknown;
    }
    boolean parse(Card one, Card next) {
        if (one.Color != next.Color) {
            return true;
        }
        return false;
        // match one and next same color; then make sure they're sequnce;
    }


}
