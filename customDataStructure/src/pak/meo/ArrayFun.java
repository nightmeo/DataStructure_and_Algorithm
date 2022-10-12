package pak.meo;

public class ArrayFun {
    public static boolean arrayCopy(final int[] src, int srcPos, final int[] dest, int destPos, final int length) {
        if (src == null || dest == null || srcPos < 0 || destPos < 0 || length < 0) return false;
        final int end = srcPos + length;
        while (srcPos < end)
            dest[destPos++] = src[srcPos++];
        return true;
    }
}
