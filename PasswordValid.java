package Lesson_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValid {

    public static void main(String[] args) {
        String password = "od3k8-B3$+86_9";
        System.out.println(CheckPassword(password));

        if(CheckPaswordNumbers(password) && CheckPaswordLetters(password) && CheckPaswordSymbols(password)) {
            System.out.println(true);
        } else System.out.println(false);
    }

    public static boolean CheckPassword(String password) {
        Pattern p = Pattern.compile("^[a-z0-9A-Z$/+_-]{8,20}$");
        Matcher m = p.matcher(password);
        return m.matches();
    }

    public static boolean CheckPaswordNumbers(String pasword) {
        Pattern p = Pattern.compile("^*.[0-9]*.{8,20}$");
        Matcher m = p.matcher(pasword);
        return m.matches();
    }

    public static boolean CheckPaswordLetters(String pasword) {
        Pattern p = Pattern.compile("^*.[A-Za-z]*.{8,20}$");
        Matcher m = p.matcher(pasword);
        return m.matches();
    }

    public static boolean CheckPaswordSymbols(String pasword) {
        Pattern p = Pattern.compile("^*.[-+_$/]*.{8,20}$");
        Matcher m = p.matcher(pasword);
        return m.matches();
    }

}
