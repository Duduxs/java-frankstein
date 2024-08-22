package main.java.basics.recursions.exercises;

public class ExerciseSix {

    public static String calculateArithmeticProgression(int terms, double actual, double reason) {
        return calculateArithmeticProgression(terms, 1, new StringBuilder(), actual, reason);
    }

    private static String calculateArithmeticProgression(int terms, int actualTerms, StringBuilder data, double actual, double reason) {
        if (actualTerms > terms) return data.toString();
        data.append(" >> ").append(actual + (actualTerms - 1) * reason);
        return calculateArithmeticProgression(terms, ++actualTerms, data, actual, reason);
    }


    public static void main(String[] args) {
        System.out.println(calculateArithmeticProgression(5, 0.80, 0.58)); //>> 0.8 >> 1.38 >> 1.96 >> 2.54 >> 3.12
        System.out.println(calculateArithmeticProgression(2, 0.80, 0.58)); // >> 0.80 >> 1.38
        System.out.println(calculateArithmeticProgression(0, 0.80, 0.58)); // empty
    }

}
