package Core;

public class Context {

    public Player CurrentPlayer;
    private static Context shared;

    private Context() {
        CurrentPlayer = new Player("Radnom_Generated");  // Should we disallow default?
    }

    public static Context self() {
        if (shared == null) {
            shared = new Context();
        }
        return shared;
    }

    public void setPlayer(Player P) {
        CurrentPlayer = P;
    }




}