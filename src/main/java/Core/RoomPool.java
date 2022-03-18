package Core;

// TODO: Lack of docs
public class RoomPool {

    FreeList<Room> Rooms;

    private RoomPool() {
        Rooms = new FreeList<>();
    }

    public Room LookupRoom() {
        Room R = null;
        for (var head = Rooms.Head; head != null; head = head.Nxt) {
            if (!head.Data.IsFull()) {
                R = head.Data;
                break;
            }
        }
        if (R == null) { // Either all rooms are full, or freeList.head == null 'empty'
            R = new Room("Hello");
            Rooms.Add(R);
        }
        return R;
    }

    // Can we infere detailed data out of it? Maybe, and not;
}
