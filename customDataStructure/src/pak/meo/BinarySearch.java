package pak.meo;

import java.util.Objects;

public class BinarySearch implements Search {
    @Override
    public int search(int[] array, int des) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (end + start) >>> 1;
            if (des == array[middle]) {
                return middle;
            } else if (des < array[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    @Override
    public <auto> int search(auto[] array, auto des) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (end + start) >>> 1;
            if (Objects.equals(des, array[middle])) {
                return middle;
            } else if ((double) des < (double) array[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
