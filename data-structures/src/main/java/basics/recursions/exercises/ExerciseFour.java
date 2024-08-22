package main.java.basics.recursions.exercises;

public class ExerciseFour {

    public static String convertToBinary(int number) {
        var result = convertToBinaryHelper(number);
        return invertString(result);
    }

    private static String convertToBinaryHelper(int number) {
        var div = number / 2;
        if (div <= 0) return "" + number;
        return number % 2 + convertToBinaryHelper(div);
    }

    private static String invertString(String data) {
        return invertString(data, new StringBuilder(), data.length()-1);
    }

    private static String invertString(String data, StringBuilder newData, int index) {
        if (index < 0) return newData.toString();
        newData.append(data.charAt(index));
        return invertString(data, newData, --index);
    }

    public static void main(String[] args) {
        System.out.println(convertToBinary(4)); //100
        System.out.println(convertToBinary(13)); //1101
        System.out.println(convertToBinary(10)); //1010
    }

}
