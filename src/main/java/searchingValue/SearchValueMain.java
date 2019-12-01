package searchingValue;

import java.util.Arrays;
import java.util.Scanner;

public class SearchValueMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the random Bound:");
        int bound = scanner.nextInt();
        System.out.println("Give the number of elements in a table:");
        int size = scanner.nextInt();

        int[] randomTable = CreateTableWithRandomValues.tableWithRandomValues(bound, size);
        System.out.println(Arrays.toString(randomTable));
        System.out.println("Max value: " + MaxValue.getMaxValue(randomTable));
        System.out.println("Min value: " + MinValue.getMinValue(randomTable));

    }
}
