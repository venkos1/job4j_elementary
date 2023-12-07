package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                if (counter != 1) {
                    result += symbol + Integer.toString(counter);
                    counter = 1;
                    symbol = input.charAt(i);
                } else {
                    result += symbol;
                    symbol = input.charAt(i);
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
