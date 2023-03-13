package Lab1;

public class MyMath {

    public static int smallest(int x, int y, int z){
        int smallest;
        if (x < y)
            smallest = x;
        else
            smallest = y;
        if (z < smallest)
            smallest = z;
        return smallest;
    }


    public static double powerMethod(double a, int b){
        double powerAnswer = 1;

        for(int i = 0; i < b; i++) {
            powerAnswer *= a;
        }

        return powerAnswer;
    }


    public static int sumOfNumbers(int n){
        int sumAnswer = 0;

        while(n>0) {
            sumAnswer += n;
            n = n - 1;
        }

        return sumAnswer;

    }

    public static int factorial (int n){
        int factorialAnswer = 1;

        while(n>0) {
            factorialAnswer *= n;
            n = n - 1;
        }

        return factorialAnswer;

    }

    public static boolean prime(int n){
        boolean primeResult = false;

        for(int i = 0; i <= n; i++) {
            if (n % i == 0)
                primeResult = false;
        }

        return primeResult;
    }

}
