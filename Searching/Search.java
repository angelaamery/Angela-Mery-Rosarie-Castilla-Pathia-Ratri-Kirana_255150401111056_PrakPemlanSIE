package Searching;

public class Search {

    public static int linearSearch(int[] arr, int search) {
        int check = 0;

        for (int i = 0; i < arr.length; i++) {
            check++; // menghitung jumlah pengecekan
            if (arr[i] == search) {
                System.out.println("Jumlah pengecekan Linear: " + check);
                return i;
            }
        }

        System.out.println("Jumlah pengecekan Linear: " + check);
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int low = 0, high = arr.length - 1;
        int check = 0;

        while (low <= high) {
            check++; // menghitung jumlah pengecekan
            int mid = low + (high - low) / 2;

            if (arr[mid] == search) {
                System.out.println("Jumlah pengecekan Binary: " + check);
                return mid;
            }

            if (arr[mid] < search)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("Jumlah pengecekan Binary: " + check);
        return -1;
    }

    public static void main(String[] args) {

        int[] data = {1, 3, 6, 10, 11, 12, 14, 21, 23, 27,
                      32, 34, 39, 43, 45, 50, 54, 56, 60, 65,
                      67, 72, 76, 78, 84, 87, 88, 90, 95, 98};

        // System.out.println("Array:");
        // System.out.println(Arrays.toString(data));
        
        // Linear Search
        int hasilLinear = linearSearch(data, 88);
        System.out.println("Linear Search Result 88 pada index: " + hasilLinear);

        int hasilLinear2 = linearSearch(data, 999);
        System.out.println("Linear Search Result 999 pada index: " + hasilLinear2);

        System.out.println();

        // Binary Search
        int hasilBinary = binarySearch(data, 88);
        System.out.println("Binary Search Result 88 pada index: " + hasilBinary);

        int hasilBinary2 = binarySearch(data, 999);
        System.out.println("Binary Search Result 999 pada index: " + hasilBinary2);

        System.out.println();

        int hasilLinear3 = linearSearch(data, 999);
        System.out.println("Linear Search Result 999 pada index: " + hasilLinear3);

        int hasilBinary3 = binarySearch(data, 999);
        System.out.println("Binary Search Result 999 pada index: " + hasilBinary3);
    }
}