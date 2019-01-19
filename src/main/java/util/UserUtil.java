package util;

import beans.User;
import config.Config;
import java.util.Scanner;

//login olmagim teleb olunur
public class UserUtil {

    public static User login(String username, String password) {
        if ("Inji".equals(username) && "12345".equals(password)) {
            User user = new User(username, password);
            return user;
        }
        throw new IllegalArgumentException("Username password is incorrect");
    }

    public static User requireInputsAndlogin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String username = sc.nextLine();

        System.out.println("Please enter your password:");
        String password = sc.nextLine();

        User user = UserUtil.login(username, password);
        Config.setUser(user);/*login olan shexs config-e set olunur, ne vaxt
                               lazim olsa getUser ile cagirilir*/
        return user;
    }

    public static User requireInputsAndLogin(int tryCount, boolean a) {
        for (int i = 0; i < tryCount; i++) {
            try {
                User user = requireInputsAndlogin();
                return user;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Try again");
            }
        }
        throw new IllegalArgumentException("You are banned!");
    }

}
