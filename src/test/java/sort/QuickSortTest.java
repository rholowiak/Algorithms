package sort;

import org.junit.Assert;
import org.junit.Test;
import sorting.QuickSort;

import java.util.Random;

public class QuickSortTest {
    @Test
    public void exampleDataShouldBeSorted() {
        int[] table = new int[]{4, 2, 6, 9, 3, 10, 5};
        QuickSort qs = new QuickSort();
        qs.sort(table, 0, table.length - 1);

        for (int i = 0; i < table.length - 1; i++) {
            Assert.assertTrue(table[i] <= table[i + 1]);
        }
    }

    @Test
    public void randomDataShouldBeSorted(){
        Random random = new Random();
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100);
        }
        QuickSort qs = new QuickSort();
        qs.sort(table, 0, table.length - 1);

        for (int i = 0; i < table.length - 1; i++) {
            Assert.assertTrue(table[i] <= table[i+1]);
        }
    }
}
