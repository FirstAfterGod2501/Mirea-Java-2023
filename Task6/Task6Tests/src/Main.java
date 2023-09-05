import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i< 50; i++){
            students.add(new Student("student",i));
        }

        InsertionSort ob = new InsertionSort();
        ob.sort((Student[]) students.toArray());
    }
}