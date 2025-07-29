package struc;

import algo.BinarySearch;

public class Array {
    // Insert: O(n)
    // Delete: O(n)
    // Access: O(1)
    int[] arr;
    int max_size;
    public int currentSize;
    

    public Array(int Size) {
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

        if (currentSize >= max_size-1) { // to avoid index errors lol
            System.out.println("Array is exceeding the current size.");
            return;
        }

        int toReplace = item;

        for (int i = 0; i < currentSize; i++) {
            int temp = arr[i];
            arr[i] = toReplace;
            toReplace = temp;
        }

        arr[currentSize++] = toReplace;

    }

    public void show() {
        for (int i =0; i < currentSize; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void insert(int item, int index) {
        if (currentSize == max_size+1) {
            System.out.println("Array is exceeding the current size.");
            return;
        }

        int toReplace = item;

        for (int i = index; i < currentSize; i++) {
            int temp = arr[i];
            arr[i] = toReplace;
            toReplace = temp;
        }

        arr[currentSize++] = toReplace;
    }

    public void remove(int index) {

    }

    public int search(int item) {
        BinarySearch.Binary_Search(item,arr, currentSize);
        return -1;
    }



}
