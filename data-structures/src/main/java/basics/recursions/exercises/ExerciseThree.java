package main.java.basics.recursions.exercises;

public class ExerciseThree {

    public static int calculatePow(int base, int exponential) {
        if (exponential == 0) return 1;
        return base * calculatePow(base, --exponential);
    }

    public static void main(String[] args) {
        System.out.println(calculatePow(2, 3)); // 8
        System.out.println(calculatePow(2, 2)); // 2
        System.out.println(calculatePow(5, 3));  // 125
        System.out.println(calculatePow(7, 2));  // 49
        System.out.println(calculatePow(12, 4)); // 20736
        System.out.println(calculatePow(3, 6));  // 729
        System.out.println(calculatePow(9, 5));  // 59049
        System.out.println(calculatePow(8, 7));  // 2097152
        System.out.println(calculatePow(15, 1)); // 15
        System.out.println(calculatePow(11, 10)); // 28531167072000
        System.out.println(calculatePow(6, 8));  // 1679616
        System.out.println(calculatePow(2, 9));  // 512
        System.out.println(calculatePow(4, 5));  // 1024
        System.out.println(calculatePow(10, 6)); // 1000000
        System.out.println(calculatePow(14, 3)); // 2744
        System.out.println(calculatePow(13, 2)); // 169
        System.out.println(calculatePow(20, 4)); // 160000
        System.out.println(calculatePow(17, 7)); // 410338673
        System.out.println(calculatePow(16, 3)); // 4096
        System.out.println(calculatePow(18, 9)); // 150094635296999121
        System.out.println(calculatePow(19, 2)); // 361
        System.out.println(calculatePow(21, 5)); // 1801088541

    }
}
