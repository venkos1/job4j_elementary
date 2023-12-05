package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            } else {
                if (counter != 1) {
                    result += input.charAt(i) + Integer.toString(counter);
                    counter = 1;
                } else {
                    result += input.charAt(i);
                }
            }
        }
        if (counter != 1) {
            result += input.charAt(input.length() - 1) + Integer.toString(counter);
        } else {
            result += input.charAt(input.length() - 1);
        }
        return result;
    }
}
