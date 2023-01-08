package Core;

public class ProjectValidator {


    boolean validateSera(Project project) {
        assert project != null;
//        assert Context.self().CurrentPlayer.CardSet.length == 8;
        Project current;
        if (project instanceof Fifty) {
            current = (Fifty) project;  // we may cache it, say Fifty object knows whats fify  if
            // to have a fifty;
            // does the claim player has 4
            // does the player have a correct 4 cards ? well


        } else if (project instanceof Sera) {
            current = (Sera) project;
        }

        return false;  // TODO:
    }
}
