package Lab_03_Array_Algorithms.Question1;

public class TestMyArrays {
    public static void main(String[] args) {
        // Test insert() method
        // Test Case 1: insert in the middle
        final int SIZE = 100;
        int [] values = new int[SIZE];
        values[0] = 23;
        values[1] = 343;
        values[2] = 4;
        values[3] = 65;
        values[4] = 31;
        int currentSize = 5;

        try{
        currentSize = MyArrays.insert(values, currentSize, 2, 55);
        System.out.println("currentSize: Expected: 6, Actual: " + currentSize);
        System.out.println("Array contents: Expected: 23, 343, 55, 4, 65, 31");
        System.out.println("Arrays contents: Actual : ");
        printArray(values, 6);

    } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Do other test cases: insert at the first position, at last position, at invalid position

    }

    public static void printArray(int [] values, int currentSize){
        for (int i = 0; i < currentSize; i++)
            System.out.print(values[i] + ", ");
        System.out.println();
    }
}
