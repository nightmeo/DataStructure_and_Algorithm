package pak.meo;

import java.util.Objects;

public class OrderSearch implements Search {
    @Override
    public int search(int[] array, int des) {
        for (int i = 0; i <= array.length - 1; ++i) {
            if (des == array[i])
                return i;
        }
        return -1;
    }

    @Override
    public <auto> int search(auto[] array, auto des) {
        for (int i = 0; i <= array.length - 1; ++i) {
            if (Objects.equals(des, array[i]))
                return i;
        }
        return -1;
    }
}
