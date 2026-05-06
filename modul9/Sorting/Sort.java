package Sorting;

import java.util.Arrays;

public class Sort {

    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;

        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[i]) { // descending
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++;
                }
            }
        }

        System.out.println("Jumlah pertukaran Bubble: " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;

        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;

            while (k >= 0 && list[k] < key) { // descending
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++; // hitung geser
            }
            list[k + 1] = key;
        }

        System.out.println("Jumlah pergeseran Insertion: " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0;

        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[minIndex]) // descending
                    minIndex = k;
            }

            if (minIndex != i) { // hanya dihitung kalau swap terjadi
                int t = list[minIndex];
                list[minIndex] = list[i];
                list[i] = t;
                tukarAtauGeser++;
            }
        }

        System.out.println("Jumlah pertukaran Selection: " + tukarAtauGeser);
        return list;
    }

    public static void main(String[] args) {
        // ubah nilai default Array ini menjadi sebanyak 30 elemen
        // acak/tidak terurut dan nilai elemennya tidak ada yang ganda.
        // int[] data = { 10, 5, 15, 8, 3 };
        // int[] sorted = bubble(data);

        // // System.out.println("Bubble Sort: " + Arrays.toString(bubble(data.clone())));
        // // System.out.println("Insertion Sort: " + Arrays.toString(insertion(data.clone())));
        // // System.out.println("Selection Sort: " + Arrays.toString(selection(data.clone())));

        // int[] hasilBubble = bubble(data.clone());
        // int[] hasilInsertion = insertion(dataclone());
        // int[] hasilSelection = selection(data.clone());

        // System.out.println(Arrays.toString(hasilBubble));
        // System.out.println(Arrays.toString(hasilInsertion));
        // System.out.println(Arrays.toString(hasilSelection));

        // System.out.println();

        int[] data = {45, 12, 78, 34, 23, 89, 67, 10, 56, 90,
                      11, 43, 65, 87, 21, 32, 54, 76, 98, 3,
                      6, 14, 27, 39, 50, 60, 72, 84, 95, 1};

        System.out.println("Array awal:");
        System.out.println(Arrays.toString(data));

        System.out.println("\nBubble Sort:");
        System.out.println(Arrays.toString(bubble(data.clone())));

        System.out.println("\nInsertion Sort:");
        System.out.println(Arrays.toString(insertion(data.clone())));

        System.out.println("\nSelection Sort:");
        System.out.println(Arrays.toString(selection(data.clone())));
    }
}