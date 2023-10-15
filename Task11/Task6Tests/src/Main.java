package Task11.Task6Tests.src;

import Task11.src.Student;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        for (int i = 0; i< 50; i++){
            students.add(new Student("student", ThreadLocalRandom.current().nextInt(0, 101)));
        }

        InsertionSort ob = new InsertionSort();
        ob.sort(students);
        System.out.println(students);
    }
}