
package Game;


import Core.Player;
import Core.RoomPool;

public final class Game {

    // Should have lots of bool vales.
    // Should have 3-4 enums vales.
    // etc...

    private Game() {
    }


    public static boolean Play(Player P) {
        var TheRoom = RoomPool.Shared().LookupRoom();
        assert TheRoom != null;
        var Val = TheRoom.Join(P);
        if (Val)
            TheRoom.Dump();
        return Val;
    }

}
