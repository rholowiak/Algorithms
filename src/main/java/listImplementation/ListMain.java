package listImplementation;

import java.util.Random;

public class ListMain {
    public static void main(String[] args) {
        IList<Integer> list = new LinkedList<>();
        Random random = new Random();
        int numbersCount = 10;
        for (int i = 0; i < numbersCount; i++){
            list.add(random.nextInt(101));
        }
        ListUtilities.display(list);
        list.add(11,2);
        ListUtilities.display(list);
        list.remove(9);
        ListUtilities.display(list);
        System.out.println(list.get(3));
        list.set(23, 1);
        ListUtilities.display(list);
    }
}
