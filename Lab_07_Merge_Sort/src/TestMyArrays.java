import java.util.Arrays;

public class TestMyArrays {
    public static void main(String[] args) {
        int[] a = {6, 3, 4, 1, 5, 2, 7};

        System.out.print("Testing array a with values: ");
        for (int element: a) {
            System.out.print(element + ", ");
        }


        MyArrays.mergeSort(a);

        System.out.print("\nSorted array is: ");

        for (int element: a) {
            System.out.print(element + ", ");
        }

    }
}
