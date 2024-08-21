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

    private static int multiFib(int number) {
        return multiFib(number, 1, 0, 1);
    }

    private static int multiFib(int n, int currentIndex, int previous, int current) {
        if (currentIndex > n) return 1;

        int next = previous + current;

        int product = (current % 2 == 0) ? current : 1;

        return product * multiFib(n, currentIndex + 1, current, next);
    }


    public static void main(String[] args) {

//        System.out.println(primeNumberOf(10));
        System.out.println(sumOfPrimeNumbersBy(53));
        System.out.println(sumOfPrimeNumbersBy(3));
        System.out.println("----------- 2 parte ---------------");
        System.out.println(multiFib(6));
//        System.out.println(sumOfPrimeNumbersBy(2));
//        IntStream.range(1,30).forEachOrdered(n -> System.out.println(n + " " +isPrime(n)));
//        IntStream.range(0,30).forEachOrdered(n -> System.out.println(multiFib(n)));

    }

}


