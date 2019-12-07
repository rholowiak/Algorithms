package zadania;

import java.util.Random;

public class UserParamsGenerator {
    public String generateLogin(String firstName, String lastName){
        return  (firstName.substring(0,1)+ lastName).toLowerCase();
    }

    public int generatePassword(){
        Random random = new Random();
        return random.nextInt(90000000) + 10000000 ;
    }
}
