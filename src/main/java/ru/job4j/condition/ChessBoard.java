package ru.job4j.condition;

public class ChessBoard {
    private static boolean isValid(int x1, int y1, int x2, int y2) {
        return x1 >= 0 && x1 <= 7 && x2 >= 0 && x2 <= 7
                && y1 >= 0 && y1 <= 7 && y2 >= 0 && y2 <= 7;
    }

    private static boolean isElephant(int x1, int y1, int x2, int y2) {
        boolean rsl = false;
        if (isValid(x1, y1, x2, y2)) {
            if (x1 != x2 && y1 != y2) {
                rsl = (Math.abs(x2 - x1) > 0) && (Math.abs(y2 - y1) > 0);
            }
        }
        return rsl;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1, y1, x2, y2)) {
           rsl = (isElephant(x1, y1, x2, y2)) ? Math.abs(x2 - x1) : 0;
        }
        return rsl;
    }
}