package Lab1;

public class TestMyMath {
    public static void main(String[] args) {

        //Testing smallest method.
        System.out.println("Testing Smallest method:");

        // Test Case 1: first argument is the smallest
        int min1 = MyMath.smallest(12,  44, 66);
        System.out.println("Expected: " + 12 + " Actual: " + min1);//or just comment: expected = 12

        // Test Case 2: second argument is the smallest
        int min2 = MyMath.smallest(12,  -10, 66);
        System.out.println("Expected: " + -10 + " Actual: " + min2);//expected = -10

	   // Test Case 3: third argument is the smallest
        int min3 = MyMath.smallest(12,  44, 4);
        System.out.println("Expected: " + 4 + " Actual: " + min3);//expected = 4


        // Test PowerMethod method.
        System.out.println("\nTesting Power method:");

        //Test Case 1: many iterations of loop
        int a = 3, b = 4;
        double pow = MyMath.powerMethod(a,b);
        System.out.println("Expected: 3^4 = 81, Actual: 3^4 = " + pow);

        //Test Case 2: no iteration of loop
        a = 4;
        b = 0;
        double pow2 = MyMath.powerMethod(a,b);
        System.out.println("Expected: 4^0 = 1, Actual: 4^0 = " + pow2);

        //Test Case 3: one iteration of loop
        a = 4;
        b = 1;
        double pow3 = MyMath.powerMethod(a,b);
        System.out.println("Expected: 4^1 = 4, Actual: 4^1 = " + pow3);


        // Test sumOfNumbers method.
        System.out.println("\nTesting sumOfNumbers method:");

        //Test Case 1: Regular Case
        int n = 6;
        int sum = MyMath.sumOfNumbers(n);
        System.out.println("Expected: Sum of 1 to 6 = 21, Actual: Sum of 1 to 6 = " + sum);

        //Test Case 2: Large Input Case
        n = 1000;
        sum = MyMath.sumOfNumbers(n);
        System.out.println("Expected: Sum of 1 to 1000 = 500500, Actual: Sum of 1 to 1000 = " + sum);


        // Test factorial method.
        System.out.println("\nTesting factorial method:");

        //Test Case 1: Regular case
        n = 5;
        int factorial = MyMath.factorial(n);
        System.out.println("Expected: 5! (factorial) = 120, Actual: 5! (factorial) = " + factorial);

        //Test Case 2: 0! case
        n = 0;
        int factorial2 = MyMath.factorial(n);
        System.out.println("Expected: 0! (factorial) = 1, Actual: 0! (factorial) = " + factorial2);

        //Test Case 3: 1! case
        n = 1;
        int factorial3 = MyMath.factorial(n);
        System.out.println("Expected: 1! (factorial) = 1, Actual: 1! (factorial) = " + factorial3);

        // Test prime method.
        System.out.println("\nTesting Prime method:");

        //Test Case 1: is Prime

        //Test Case 2: is not Prime

        //Test Case 3: 1 test case

    }
}
