package zadania;

import java.util.HashMap;

public class UserService {
    private HashMap<Integer, User> hashMap = new HashMap<>();
    private int counter;

    public void add(User someUser){
        for (User user:hashMap.values()) {
            if (someUser.login.equals(user.login)){
                System.out.println("This user already exists!");
                return;
            }
        }
        if (!someUser.isAdult()){
            System.out.println("This user is not adult, it can't be added!");
            return;
        }
        if (!someUser.tableIsFulFilled()){
            System.out.println("This user has not fulfilled all fields!");
            return;
        }
        hashMap.put(counter, someUser);
        counter++;

    }
    public void update(User someUser){
        User[] users = (User[]) hashMap.values().toArray();
        for (int i = 0; i < users.length; i++) {
            if (someUser.login.equals(users[i].login)){
                // dodać w klasie User getery i settery tak aby można było zmodyfikować
                //zastąpić istniejące pola tymi nowymi
            }

        }

    }
}
