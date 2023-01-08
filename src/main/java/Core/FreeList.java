package Core;


// This should be a stack
public class FreeList<Struct> {
    // A node 'A single room effectively'
    static class Header<Struct> {
        Struct Data;
        Header<Struct> Nxt;

        public Header(Struct D) {
            Data = D;
        }
    }

    Header<Struct> Head;
    private int Size;

    public FreeList() {
        Head = null;
        Size = 0;
    }

    public boolean Add(Struct Ele) {
        var Node = new Header<Struct>(Ele);
        if (Head == null) {
            Head = Node;
            Size++;
            return true;
        }
        Node.Nxt = Head;
        Head = Node;
        Size++;
        return true;
    }

    public void ForEach(FnIter<Struct> Fn) {
        var Current = Head;
        while (Current != null) {
            Fn.Consume(Current.Data);
            Current = Current.Nxt;
        }
    }

}
