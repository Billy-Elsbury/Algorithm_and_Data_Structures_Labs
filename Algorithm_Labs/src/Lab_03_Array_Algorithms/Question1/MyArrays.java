package Lab_03_Array_Algorithms.Question1;

public class MyArrays {

    public static int insert(int[] values, int currentSize, int pos, int newElement) throws IllegalArgumentException {
        if (pos < 0 || pos > currentSize) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (currentSize >= values.length) {
            return currentSize;
        }
        for (int i = currentSize - 1; i >= pos; i--) {
            values[i + 1] = values[i];
        }
        values[pos] = newElement;
        return ++currentSize;
    }
}

