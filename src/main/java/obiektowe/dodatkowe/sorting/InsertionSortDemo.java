package obiektowe.dodatkowe.sorting;

import java.util.Arrays;

import static obiektowe.dodatkowe.sorting.InsertionSort.insertionSort;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] array = {34, 6, 54, 2, 8, 3, 0, 2, 5, 9, 3, 3245, 43, 434, 235, 32, 53, 35};
        System.out.println(Arrays.toString(array));
        array = insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
