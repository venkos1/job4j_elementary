package ru.job4j.array;

import java.util.Arrays;
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        money -= price;
        int size = 0;
        for (int i : coins) {
            while (money - i >= 0) {
                money -= i;
                rsl[size] = i;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
