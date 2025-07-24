package struc;

import java.util.ArrayList;

public class Stack {
    
    // Add : O(1)
    // Remove: O(1)
    // Search : Linear : O(m), Binary : O( log n )
    // Access : O(1)

    ArrayList<Integer> arr;
    int size;

    public Stack() {
        arr = new ArrayList<Integer>();
        size = arr.size();
    }

    public void remove() {
        if (size == 0) { 
            System.out.println("Array is empty");
            return;
        } else {
            System.out.println("Element Removed: "+arr.remove(--size).toString());
            return;
        }
    }

    public void add(int toAdd) {
        arr.add(toAdd);
        size++;
        System.out.println("Element " + Integer.toString(toAdd)+ " was added successfully. Size of the aray: "+ Integer.toString(size));
    }

    // returns -1 or the index
    public int SearchLinear(int toFind) {
        for (int i = 0; i < size; i++) {
            if (arr.get(i) == toFind) {
                return i;
            } else continue;
        }
        return -1; // If not found
    }

    public int SearchBinary(int toFind) {
        int start=0; int end=size-1; int mid=(size-1)/2;
        boolean toTerminate = false;
        try {
            while (!toTerminate) {
                if (arr.get(mid) == toFind) {
                    return mid;
                } else if (arr.get(mid) > toFind) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }
                mid=(start+end)/2;

                if (start == mid && mid == end && arr.get(mid) != toFind) toTerminate=true;

            }
        } catch (IndexOutOfBoundsException E) {
            System.out.println("Item not found");
        }

        return -1;

    } 

}
