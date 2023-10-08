import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String inn = "123456721890"; // Замените на введенный ИНН

        // Проверяем, соответствует ли введенный ИНН шаблону
        if (isValidInn(inn)) {
            System.out.println("ИНН действителен");
        } else {
            System.out.println("ИНН недействителен");
        }
    }

    public static boolean isValidInn(String inn) {
        // Шаблон для проверки ИНН
        String innPattern = "\\d{10}|\\d{12}";

        // Создаем объект Pattern
        Pattern pattern = Pattern.compile(innPattern);

        // Создаем объект Matcher
        Matcher matcher = pattern.matcher(inn);

        // Проверяем, соответствует ли введенный ИНН шаблону
        return matcher.matches();
    }
}