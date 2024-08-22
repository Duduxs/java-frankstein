package main.java.basics.recursions.exercises;

public class ExerciseFive {

    public static int sumArray(int[] numbers) {
        return sumArray(numbers, 0);
    }

    private static int sumArray(int[] numbers, int currentIndex) {
        if(numbers.length == currentIndex) return 0;
        return numbers[currentIndex] + sumArray(numbers, ++currentIndex);
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{2, 5, -20, 7, 100, 1, -14, 78, 30, 0 })); //189
        System.out.println(sumArray(new int[]{4, 6, 10 })); // 20
        System.out.println(sumArray(new int[]{0, 1, 0 })); // 1
        System.out.println(sumArray(new int[]{1, 1, 1 })); // 3
        System.out.println(sumArray(new int[]{0, 0, 0 })); // 0
    }

}
