package Core;

import CardEngine.Card;
import CardEngine.CardSet;

import java.security.SecureRandom;

public class Hundred extends Project {
    // TODO:
    // enum Color {
    //     Club, Diamond, Heart, Spade;
    // }

    // enum ImageMatch {
    //     Tens, Jacks, Queens, Kings; // TODO: Aces 400 
    // }
    public enum HundredType { 
        Unknwon/*We're generating*/, ImageMatchy(/*Image type*/), SequenceOrder(/*Card Color*/);
    }

    HundredType Type;
    public static final int SUN_VALUE = 20;
    public static final int Hukom_VALUE = 10;


    final static Card[] AllPossible100 = new Card[] { new Card(Card.CardName.Seven), new Card(Card.CardName.Eight), new Card(Card.CardName.Nine),
                                                new Card(Card.CardName.Ten), new Card(Card.CardName.Jack), new Card(Card.CardName.Queen),
                                                new Card(Card.CardName.King), new Card(Card.CardName.Ace) };
    final static Card[] AllPossibleImage = new Card[] {
            new Card(Card.CardName.Ten), new Card(Card.CardName.Jack),
            new Card(Card.CardName.Queen), new Card(Card.CardName.King),
            new Card(Card.CardName.Ace)
    };
    public Hundred(HundredType T) {
        super(ProjectType.Hundred_);
        Type = T;
    }

    // This will generate a sequence of cards representing A Hundred.
    public static void DoGenerate(Card.CardColor PickedColor, CardSet Cards) {
        var rand = new SecureRandom();
        int randomIndex = rand.nextInt(4);// 0 inclusive to 3 inclusive
        int seq_max = 0;
        while (seq_max != 5) {
            var CurrentCard = AllPossible100[randomIndex++];
            CurrentCard.Color = PickedColor;
            Cards.InsertInto(CurrentCard);
            seq_max ++;
        }
    }

    public static void DoGenerateImage(CardSet Cards) {
        var rand = new SecureRandom();
        int randomIndex = rand.nextInt(5); // FIXME
        Card the_image = AllPossibleImage[randomIndex];
        var colors = new Card.CardColor[] {Card.CardColor.Spade, Card.CardColor.Heart, Card.CardColor.Club, Card.CardColor.Diamond};
        for (int i = 0, len = colors.length; i < len; i++) {
            the_image.Color = colors[i];
            Cards.InsertInto(the_image);
        }

    }
}