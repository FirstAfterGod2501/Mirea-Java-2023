import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String inn = "123456721890";

        if (isValidInn(inn)) {
            System.out.println("ИНН действителен");
        } else {
            System.out.println("ИНН недействителен");
        }
    }

    public static boolean isValidInn(String inn) {
        String innPattern = "\\d{10}|\\d{12}";

        Pattern pattern = Pattern.compile(innPattern);

        Matcher matcher = pattern.matcher(inn);

        return matcher.matches();
    }
}