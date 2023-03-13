package Lab_06_Recursion;

import java.util.Arrays;
import java.util.Random;

public class TestMyArrays {
    public static void main(String[] args) {
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
            System.out.print(a[i] + ", ");
        }

        System.out.println("\n");

        MyArrays.selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        System.out.println("\n");

        MyArrays.insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }


        Random random = new Random();
        int SIZE = 100000;
        a = new int[SIZE];
        for (int i = 0; i < a.length; i++){
            a[i] = random.nextInt(Integer.MAX_VALUE);
        }
        int[] b = new int[SIZE];
        for(int i = 0; i < b.length; i++){
            b[i] = a[i];
        }
        int[] c = new int[SIZE];
        for(int i = 0; i < c.length; i++){
            c[i] = a[i];
        }


        System.out.println("\n"+"\n");

        long startTimeSelection = System.currentTimeMillis();
        MyArrays.selectionSort(a);
        long endTimeSelection = System.currentTimeMillis();

        long startTimeInsertion = System.currentTimeMillis();
        MyArrays.insertionSort(b);
        long endTimeInsertion = System.currentTimeMillis();

        long startTimeArray = System.currentTimeMillis();
        Arrays.sort(c);
        long endTimeArray = System.currentTimeMillis();



        long selectionTime = endTimeSelection - startTimeSelection;
        System.out.println(selectionTime);

        long insertionTime = endTimeInsertion - startTimeInsertion;
        System.out.println(insertionTime);

        long arrayTime = endTimeArray - startTimeArray;
        System.out.println(arrayTime);


        SIZE = 100000;
        a = new int[SIZE];
        for (int i = 0; i < a.length; i++){
            a[i] = i;
        }
        b = new int[SIZE];
        for(int i = 0; i < b.length; i++){
            b[i] = i;
        }
        c = new int[SIZE];
        for(int i = 0; i < c.length; i++){
            c[i] = i;
        }


        System.out.println("\n"+"\n");

        startTimeSelection = System.currentTimeMillis();
        MyArrays.selectionSort(a);
        endTimeSelection = System.currentTimeMillis();

        startTimeInsertion = System.currentTimeMillis();
        MyArrays.insertionSort(b);
        endTimeInsertion = System.currentTimeMillis();

        startTimeArray = System.currentTimeMillis();
        Arrays.sort(c);
        endTimeArray = System.currentTimeMillis();



        selectionTime = endTimeSelection - startTimeSelection;
        System.out.println(selectionTime);

        insertionTime = endTimeInsertion - startTimeInsertion;
        System.out.println(insertionTime);

        arrayTime = endTimeArray - startTimeArray;
        System.out.println(arrayTime);
    }
}
