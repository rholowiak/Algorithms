package timer;

import listImplementation.ArrayList2x;
import listImplementation.IList;
import listImplementation.ListUtilities;

import java.util.Random;

public class SortExaminator {
    public static void main(String[] args) {
        IList<Integer> list;
        Random random = new Random();
        Stopwatch stopwatch = new Stopwatch();
        int randomBound = 100;
        int[] elementsCount = new int[]{100, 1000, 5000};
        long[] results = new long[elementsCount.length];
        int repetitions = 100;

        for (int i = 0; i < elementsCount.length; i++){
            for(int repetition = 0; repetition < repetitions; repetition++) {
                list = new ArrayList2x<>();
                for (int j = 0; j < elementsCount[i]; j++) {
                    list.add(random.nextInt(randomBound));
                }
                stopwatch.Start();
                ListUtilities.insertSort(list);
                results[i] += stopwatch.Stop();
            }
            results[i] /= repetitions;
        }
        for(long time:results){
            System.out.println(time + " ");
        }
    }
}
