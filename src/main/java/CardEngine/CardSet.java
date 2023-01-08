package CardEngine;

import Core.Project;

import java.util.List;



public class CardSet {

    ArrayOf8<Card> Cards = new ArrayOf8<>();    // Each player will have a cardset(Randomly generated);

    List<Project> PossibleProjects;

    // We feed in ProjectValidator/MexDetector with these possible

    // We could inject card generator in here.


    public Project issueProject(Project.ProjectType type) {

        // TODO: Allow user to announce a project.
        return null;

    }

    public boolean InsertInto(Card C) {
        return Cards.Append(C);
    }
}

// // A single card set.
// public class CardSet {
// //
// //    // this is the static set !;
// //    // infere the info
// //    // from card data structure;
// //    // card generator;
// //    // will infere this info and
// //    // generate on denmand;
// //    // on demand will be the round
// //    //
// //
//     private final ArrayOf32<Card> Cards = new ArrayOf32<>();
//     private static CardSet instance;


//     private CardSet() {
//         Fill();
//     }

//     public static CardSet Own() {
//         if (instance == null) { instance = new CardSet(); }
//         return instance;
//     }

//     private void Fill() {
//         // Fill is the important part here;
//         var ClubObj = new Club();
//         var Heart = new Heart();
//         var Dia = new Diamond();
//         var Spa = new Spade();

//         ClubObj.ExecSet(this.Cards);
//         Heart.ExecSet(this.Cards);
//         Dia.ExecSet(this.Cards);
//         Spa.ExecSet(this.Cards);
//     }
// //
// //    private CardSet() {};
// //    public final void FillSet() {
// //
// //        // TODO: Use a visitor CardSet;
// //
// //
// //    }
// //
//     public ArrayOf32<Card> GetCards() { return Cards; }
// }