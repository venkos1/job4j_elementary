package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        if (ivan != nik) {
            while (ivan < nik) {
                month += 1;
                nik *= 2;
                ivan *= 3;

            }
        } else {
            month = 1;
        }
        return month;
    }
}
