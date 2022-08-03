package obiektowe.dodatkowe.sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] x) {

        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] > x[i + 1]) {

                int temp = x[i + 1];
                x[i + 1] = x[i];
                x[i] = temp;

                for (int j = i - 1; j >= 0; j--) {

                    if (x[j] > x[j + 1]) {
                        temp = x[j];
                        x[j] = x[j + 1];
                        x[j + 1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
        return x;
    }
}
