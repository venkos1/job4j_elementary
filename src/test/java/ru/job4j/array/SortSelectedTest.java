package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith3Numbers() {
        int[] data = new int[] {64, 41, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {12, 41, 64};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith5Numbers() {
        int[] data = new int[] {24, 65, 24, 72, 51};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {24, 24, 51, 65, 72};
        assertThat(result).containsExactly(expected);
    }

}