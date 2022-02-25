package CardEngine;

public class ArrayOf32<T extends Comparable> {

    // data structure
    private T[] ValuesOf_32;

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
    public static final int SIZE = 32;

    public ArrayOf32() {

        ValuesOf_32 = (T[]) new Comparable[32];
    }


    public boolean Append(T Val) {
        if (Ptr > 32) {
            return false;
        }
        ValuesOf_32[Ptr++] = Val;
        return true;
    }

    public Iterator<T> iterator() {
        return new Iterator<>(this.ValuesOf_32);
    }

}
