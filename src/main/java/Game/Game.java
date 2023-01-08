
package Game;


import Core.Context;
import Core.RoomPool;

public final class Game {

    // Should have lots of bool vales.
    // Should have 3-4 enums vales.
    // etc...


    enum PlayMode {
        Offline, 
        Online, // Random search algorithm for room collection
        PrivateRoom, // Creating a private room and lock it maybe.
        Friendly // 
    }

    static boolean IsOffline = false;

    private Game() {
    }


    public static boolean Play() {
        var TheRoom = RoomPool.Shared().LookupRoom();
        assert TheRoom != null;
        
        var Val = TheRoom.Join(Context.self().CurrentPlayer);
        if (Val)
            TheRoom.Dump();
        return Val;
    }

    public static boolean PlayOffline() {
        IsOffline = true;
        return true;
    }
}

