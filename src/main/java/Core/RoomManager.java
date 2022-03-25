package Core;

public class RoomManager {
    private static final char[] UNIQUE_ID = {'A', 'B', 'C', 'D'};
    private int Cursor = 0;

    // FIXME: This should be static and use list data structure
    public void Assign(Player Joined) {
        Joined.Identifier = UNIQUE_ID[Cursor++];
        ShuffleFrom(Cursor);
    }

    private boolean ShuffleFrom(int Idx) {
        // FIXME: Assume Idx is always < UNIQ_ID.length!
        for (var CurrentIndex = Idx; CurrentIndex < UNIQUE_ID.length; CurrentIndex++) {
            var RandIdx = Idx + (int) (Math.floor(Math.random() * (UNIQUE_ID.length - Idx)));
            var TempVal = UNIQUE_ID[CurrentIndex];
            UNIQUE_ID[CurrentIndex] = UNIQUE_ID[RandIdx];
            UNIQUE_ID[RandIdx] = TempVal;
        }
        return true; // I mean, We could check probability val, weather was shuffled(true) or not(false)
    }
}
