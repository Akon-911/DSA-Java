package struc;

public class Stack {
    
    // Add : O(1)
    // Remove: O(1)
    // Search : Linear : O(m), Binary : O( log n )
    // Access/Seek : O(1)

    int[] arr;
    int size;
    int pointer;

    public Stack(int Size) {
        this.size = Size;
        this.arr = new int[Size];
        this.pointer = -1;
    }

    public void seek() {

        if (pointer == -1) System.out.println("Stack is empty");
        else System.err.println(arr[pointer]);

    }

    @SuppressWarnings("null")
    public void remove() {
        if (pointer == -1) { 
            System.out.println("Stack is already Empty");
            return;
        } else {
            System.out.println(arr[pointer]);
            arr[pointer--] = (Integer) null;
        }
    }

    public void add(int toAdd) {
        if (pointer == size-1) {
            System.out.println("Stack is full");
            return;
        } else {
            arr[pointer++] = toAdd;
            return;
        }

    }

    

}
