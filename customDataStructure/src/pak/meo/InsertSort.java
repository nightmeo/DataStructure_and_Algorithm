package pak.meo;

public class InsertSort {
    public static void insertionSort(int[] array, int low, int high) {
        int k = low;

        while (true) {
            int i, ai;
            do {
                if (++k >= high) {
                    return;
                }

                ai = array[i = k];
            } while (ai >= array[k - 1]);

            while (true) {
                if (--i < low || ai >= array[i]) {
                    array[i + 1] = ai;
                    break;
                }

                array[i + 1] = array[i];
            }
        }
    }
}
