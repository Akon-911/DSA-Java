package algo;
public class BinarySearch {

    public static int[] arr = { 1, 2, 3, 5, 7, 9, 11, 13, 17, 19, 23 };

    public static boolean Linear_Search(int x, int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i] == x) {
                return true;
            } else
                continue;

        }
        return false;
    }

    public static boolean Binary_Search(int x, int[] Arr) {
        int start=0;
        int end=arr.length;
        int mid=arr.length/2;

        boolean found = false;
        try {
            while (!found) {
            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] > x) {
                end=mid-1;
                mid=end/2;
            } else if (arr[mid] < x) {
                start = mid+1;
                mid = (end+start)/2;
            }
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Item not found");
        }

        return false;

    }

        public static boolean Binary_Search(int x, int[] Arr, int size) {
        int start=0;
        int end=size;
        int mid=size/2;

        boolean found = false;
        try {
            while (!found) {
            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] > x) {
                end=mid-1;
                mid=end/2;
            } else if (arr[mid] < x) {
                start = mid+1;
                mid = (end+start)/2;
            }
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Item not found");
        }

        return false;

    }
}