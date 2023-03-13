package Lab_07_Merge_Sort;

import java.util.Arrays;

public class MyArrays {
    public static void mergeSort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        // Copy the first half of a into first, the second half into second
        // write this code yourselves…
        int [] first = Arrays.copyOfRange(a, 0, a.length / 2);
        int [] second = Arrays.copyOfRange(a, a.length / 2, a.length);

        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);
    }

    private static void merge(int[] first, int[] second, int[] a) {

        int iFirst = 0, iSecond = 0, j = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }

        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}
