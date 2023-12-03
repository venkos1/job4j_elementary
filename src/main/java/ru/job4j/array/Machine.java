package ru.job4j.array;

import java.util.Arrays;
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int refund = money - price;
        int size = 0;
        if (refund != 0) {
            for (int i = 0; i <= 3; i++) {
                while (refund - coins[i] >= 0) {
                    refund -= coins[i];
                    rsl[size] = coins[i];
                    size++;
                }
            }
            return Arrays.copyOf(rsl, size);
        }
        return Arrays.copyOf(rsl, 0);
    }
}
