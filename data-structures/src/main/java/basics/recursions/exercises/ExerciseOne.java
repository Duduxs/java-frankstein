package main.java.basics.recursions.exercises;

public class ExerciseOne {

    private static boolean isPrime(int number, int mod) {
        if (mod <= 1) return true;
        if (number % mod == 0) return false;
        return isPrime(number, --mod);
    }

    public static boolean isPrime(int number) {
        return isPrime(number, --number);
    }

    public static int sumOfPrimeNumbersBy(int interval) {
        if (interval <= 1) {
            return 0;
        }
        if (isPrime(interval)) {
            return interval + sumOfPrimeNumbersBy(--interval);
        }
        return sumOfPrimeNumbersBy(--interval);
    }

    public static void main(String[] args) {

//        System.out.println(primeNumberOf(10));
        System.out.println(sumOfPrimeNumbersBy(53));
        System.out.println(sumOfPrimeNumbersBy(3));
//        System.out.println(sumOfPrimeNumbersBy(2));
//        IntStream.range(1,15).forEachOrdered(n -> System.out.println(n + " " +isPrime(n)));
    }

}


