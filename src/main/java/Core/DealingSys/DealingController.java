package Core.DealingSys;


import Core.Player;
import Core.Room;

// Keep track of players table and their turn && dealers;
// We'll see if this will be a static service provider 'API'
public class DealingController {
    Room CurRoom;
    Player Dealer; // FIXME

    public DealingController(Room CR) {
        CurRoom = CR;
    }

    // TODO: All return type should be smth different, and must have params instead.
    private Player /*&*/ NextDealer() {
        // FIXME: Should be for sure, O(1), Until we have 'team makeup/pair mechanism'


        assert Dealer != null;

        var LookupChar = MapNxtDealer(Dealer.Identifier);

        Player NxtDealer = Dealer;
        for (int i = 0, len = CurRoom.Players.length; i < len; i++) {
            if (CurRoom.Players[i].IsDealer) continue;  // Skip

            if (CurRoom.Players[i].Identifier == LookupChar) {
                NxtDealer = CurRoom.Players[i];
                break;
            }
        }

        // If Dealer == NxtDealer : means we fail to continue 'الصكة'
        return NxtDealer;

    }

    private char MapNxtDealer(char CurrentDealer) {

        return switch (CurrentDealer) {
            case 'A' -> 'C';
            case 'C' -> 'B';
            case 'B' -> 'D';
            case 'D' -> 'A';
            default -> 0; // UNREACHABLE
        };

    }

    private Player GenerateDealer() {
        // TODO: AlreadyGeneratedRooms, To mark rooms has asked. Force By API.

        assert CurRoom.IsFull();  // FIXME: This is not deterministic, Assume full means 4 players have joined the room

        var Min = 0;
        var Max = 3;
        var RandIndex = (int) Math.floor(Math.random() * (Max - Min + 1) + Min);  // Generate random int value from 0 to 3
        Dealer = CurRoom.Players[RandIndex];  // FIXME
        Dealer.IsDealer = true;

        return Dealer;
    }

    public Player DoIt() {
        return GenerateDealer();
    }
}
