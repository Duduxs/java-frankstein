package main.java.basics.recursions.exercises;

import java.util.Arrays;

public class ExerciseSeven {

    public static int[] invert(int[] numbers) {
        return invert(numbers, new int[numbers.length], 0, numbers.length - 1);
    }

    private static int[] invert(int[] numbers, int[] newArray, int newArrayIndex, int currentIndex) {
        if (currentIndex < 0) return newArray;
        newArray[newArrayIndex] = numbers[currentIndex];
        return invert(numbers, newArray, ++newArrayIndex, --currentIndex);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{1, 2, 3, 4, 5}))); // 5,4,3,2,1
        System.out.println(Arrays.toString(invert(new int[]{10, 20}))); //20,10
        System.out.println(Arrays.toString(invert(new int[]{20}))); //20
        System.out.println(Arrays.toString(invert(new int[]{5,4,3,2,1}))); //1,2,3,4,5
    }
}
