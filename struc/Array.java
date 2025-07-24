package struc;

public class Array {
    // Insert: O(n)
    // Delete: O(n)
    // Access: O(1)
    int[] arr;
    int max_size;
    int currentSize;

    Array(int Size) {
        max_size=Size;
        arr = new int[Size];
        currentSize=0;
    }

    public void append(int item) {
        if (currentSize == max_size) { // to avoid index errors lol
            System.out.println("Array is exceeding the current size.");
            return;
        }

        arr[currentSize++] = item;

    }

    
    public void insertFirst(int item) {

    }

    public void remove(int item) {

    }



}
