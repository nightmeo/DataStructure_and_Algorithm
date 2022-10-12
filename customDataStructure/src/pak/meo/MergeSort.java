package pak.meo;

public class MergeSort {
    public static void mergeSort(final int[] array, final int left, final int right) {
        int middle = (left + right) / 2;

        if (left < right) {
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            int[] temp = new int[right - left + 1];
            int i0 = 0;
            int i1 = left;
            int i2;

            for (i2 = middle + 1; i1 <= middle && i2 <= right; temp[i0++] = array[i1] > array[i2] ? array[i2++] : array[i1++]) {
            }

            System.arraycopy(array, i2 > right ? i1 : i2, temp, i0, temp.length - i0);

            System.arraycopy(temp, 0, array, left, temp.length);
        }
    }
}
