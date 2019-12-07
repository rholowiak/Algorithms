package zadania;

import java.time.LocalDate;

public class User {
    String firstName;
    String lastName;
    String login;
    String password;
    LocalDate birthDate;

    public User(String firstName,String lastName, String login, String password, LocalDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.birthDate = birthDate;
    }


    public boolean tableIsFulFilled(){
        if (firstName != null && lastName != null && login != null && password != null && birthDate != null){
            return true;
        }else {
            return false;
        }

    }
    public boolean isPasswordCorrect(){
        if (password.length() >= 8){
            return true;
        }else {
            return false;
        }
    }
    public boolean isAdult(){
        LocalDate now = LocalDate.now();
        LocalDate referenceDate18 =  now.minusYears(18);
        if (birthDate.compareTo(referenceDate18) <= 0){
            return true;
        }else {
            return false;
        }
    }
}
