package Core;

// TODO: Lack of docs
public class RoomPool {

    private static RoomPool __pool__;
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

    public static RoomPool Shared() {
        if (__pool__ == null) {
            __pool__ = new RoomPool();
        }
        return __pool__;
    }

    public void Dump(){
        // Dump the rooms pool; w/ format as needed
        Rooms.ForEach(Room -> {
            System.out.println(Room.toString());
        });


    }
}
