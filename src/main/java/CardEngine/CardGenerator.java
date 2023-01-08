package CardEngine;

import Core.Hundred;

import java.security.SecureRandom;

// This is a good place to apply visitor.
public class CardGenerator {
    CardSet Set; // User's sew card set should be created by another system layer, Effectively by the RoomKeeper.

    enum GenState {
        Unknown, Normal, Serra,  OneProject/*(100, 50)*/, TwoProject/*(Serra&100,     Serra+50, DoubleSerra, 50&50, 100&50, 400, maybe others ...)*/
        /*
            For TwoProject_case -- probability should as low as possible, in one full game it should occur normally once or never.
            For Normal_case -- should be that normal 50%+ case for a player.
            Serra/oneProject_case  well to some 45%+ .
            So far i have no idea which Card-Mechanism i will pick, Maybe there's a standard?

         */
    }

    protected CardGenerator(CardSet S) {
        Set = S;
    }

    public void Generate() {
        // this function should be called every round.
    }
    public void GenerateFifty() {}
    public Hundred.HundredType GenerateHundred() {
        Hundred.HundredType Result;

        Result = randomGenerator(); // Randomly pick weather a seq, match
        if (Result == Hundred.HundredType.SequenceOrder) {
            var color = pickColorRandomly();

            Hundred.DoGenerate(color, Set);

            return Result;
        }
        Result = Hundred.HundredType.ImageMatchy;
        Hundred.DoGenerateImage(Set);
        // var newProject = new Project(Project.ProjectType.Hundred_); // TODO: Log generated project for validation.
        // ProjectValidator.logNew(Project, CardSet);
        return Result;
    }
    // Don't ask me why i pick this way!
    private Hundred.HundredType randomGenerator() {
        var rand = new SecureRandom();
        int randomNumber = rand.nextInt(101);// 0 inclusive to 100 inclusive.

        if (randomNumber % 2 == 0) {
            // if it's even, Choose sequence.
            // NOTE:  No reason, Could be changed later.
            return Hundred.HundredType.SequenceOrder;
        }

        return Hundred.HundredType.ImageMatchy;
    }
    private Card.CardColor pickColorRandomly() {
        var rand = new SecureRandom();
        int randomNumber = rand.nextInt(101);

        if (randomNumber <= 25) {
            return Card.CardColor.Spade;
        } else if (randomNumber <= 50) {
            return Card.CardColor.Heart;
        } else if (randomNumber <= 75) {
            return Card.CardColor.Club;
        }
        return Card.CardColor.Diamond;
    }
    public void GenerateSerra() {}
    public void GenerateDump() {}



}
