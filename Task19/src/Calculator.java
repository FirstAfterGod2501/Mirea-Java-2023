public class Calculator {
    public static <T extends Number, V extends Number> double sum(T num1, V num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T num1, V num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T num1, V num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T num1, V num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}