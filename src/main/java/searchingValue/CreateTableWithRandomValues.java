package searchingValue;

import java.util.Random;

public class CreateTableWithRandomValues {
    public static int[] tableWithRandomValues(int bound, int size){
        Random random = new Random();
        int randomBound = bound;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(randomBound);
        }
        return numbers;
    }
}
