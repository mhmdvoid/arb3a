package Core;

public class GameResult {
    //    everyRoom has a GameResult(Like a decider);
    Room TheRoom;
    int score; // If this is >= 152, room.finished==true.

    public GameResult(Room theRoom) {
        TheRoom = theRoom;
    }

    public boolean ShouldEndGame() {
        if (score >= 152) {
            TheRoom.Finished = true;
            return true;
        }
        return false;
    }

}
