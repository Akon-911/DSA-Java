package struc;

import java.util.ArrayList;

public class Queue {
    
    // Add : O(1)
    // Remove: O(n)
    // Search : Linear : O(m), Binary : O( log n )

    ArrayList<Float> arr = new ArrayList<Float>();
    int size = arr.size();

    public void remove() {
        if (size == 0) { 
            System.out.println("Array is empty");
            return;
        } else {
            System.out.println("Element Removed: "+arr.remove(0).toString());
            size--;
            return;
        }
    }

    public void add(Float toAdd) {
        arr.add(toAdd);
        size++;
        System.out.println("Element " + toAdd.toString()+ " was added successfully. Size of the aray: "+ Float.toString(size));
    }

    // returns -1 or the index
    public int SearchLinear(Float toFind) {
        for (int i = 0; i < size; i++) {
            if (arr.get(i) == toFind) {
                return i;
            } else continue;
        }
        return -1; // If not found
    }

}
