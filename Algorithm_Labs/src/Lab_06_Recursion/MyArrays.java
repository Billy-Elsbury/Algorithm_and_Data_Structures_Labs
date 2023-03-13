package Lab_06_Recursion;

public class MyArrays {
    public static void selectionSort(int[] a) {
        //sorting in ascending order
        for (int i = 0; i <= a.length - 2; i++) {
            //find index such that a[index] is the smallest of a[i]..a[a.length-1]
            int index = i;
            int smallest = a[i];
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    index = j;
                }
            }
            //if index != i, swap a[index] and a[i].
            if (index != i) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }
    public static void insertionSort(int[] a){
        for(int i = 1; i <= a.length - 1; i++){
            int val = a[i];
            int j = i-1;
            while(j >= 0 && (a[j] > val)){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = val;
        }
    }
}
