package zadania;

import java.time.LocalDate;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("Rafal", null, "rholowiak",
                "password", LocalDate.of(2001,12,8));
        System.out.println(user1.tableIsFulFilled());
        System.out.println(user1.isPasswordCorrect());

        UserParamsGenerator generatePassword = new UserParamsGenerator();
        System.out.println(generatePassword.generateLogin("Rafal", "Holowiak"));
        System.out.println(generatePassword.generatePassword());

        System.out.println(user1.isAdult());

        UserService userService = new UserService();
        userService.add(user1);
        userService.add(user1);

    }
}
