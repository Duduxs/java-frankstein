package main.java.basics.recursions.exercises;

public class ExerciseSix {

    public static String calculateArithmeticProgression(int terms, double actual, double reason) {
        if(terms <= 0) return "NO PA";
        return calculateArithmeticProgression(terms, 1, new StringBuilder(), actual, reason);
    }

    private static String calculateArithmeticProgression(int terms, int actualTerms, StringBuilder data, double actual, double reason) {
        if(actualTerms > terms) return data.toString();
        var s =" >> " + (actual + (actualTerms - 1) * reason);
        data.append(s);
        return calculateArithmeticProgression(terms, ++actualTerms, data, actual, reason);
    }


    public static void main(String[] args) {
        System.out.println(calculateArithmeticProgression(5, 0.80, 0.58));
    }

}
