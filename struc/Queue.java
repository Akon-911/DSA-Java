package struc;

public class Queue {
    
    // Add : O(1)
    // Remove: O(n)
    // Access/seek : O(1)

    int[] arr;
    int currSize;
    private int max_size;

    public Queue(int Size) {
        this.arr = new int[Size];
        this.currSize = 0;
        this.max_size = Size;
    }

    public int seek() {    
        return arr[0];
    }

    public void append(int item) {

        if (currSize == arr.length) {
            System.out.println("Queue Overflowing");
        } else {
            this.arr[currSize++] = item;
        }
    
        return;

    }

    public void pop() {
        if (currSize == 0) {
            System.out.println("Queue is empty...");
            return;
        } else {
            System.out.println("Popped element :"+arr[0]);
            int[] toReplace = new int[max_size];
            for (int i = 1; i <currSize; i++) {
                toReplace[i-1] = arr[i];
            }
            arr = toReplace;
            currSize--;
        }
    }

    public void printQ() {
        for (int i = 0; i < currSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
