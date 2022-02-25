package CardEngine;


public class ArrayOf8<T extends Comparable> {

    // data structure
    private T[] ValuesOf_8;

    public static class Iterator<T> {
        int begin, end;
        T[] arr;

        public Iterator(T[] arr) {
            begin = 0;
            this.arr = arr;
            this.end = this.arr.length;
        }

        public boolean HasNext() {
            return begin != end;
        }

        public T Next() {
            return arr[begin++];
        }
    }

    private int Ptr;
    public static final int SIZE = 8;

    public ArrayOf8() {

        ValuesOf_8 = (T[]) new Comparable[SIZE];
    }


    public boolean Append(T Val) {
        if (Ptr > SIZE) {
            return false;
        }
        ValuesOf_8[Ptr++] = Val;
        return true;
    }

    public Iterator<T> iterator() {
        return new Iterator<>(this.ValuesOf_8);
    }

}
