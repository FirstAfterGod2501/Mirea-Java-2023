package Task11.src;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {

    public static List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }

        int mid = students.size() / 2;
        List<Student> left = students.subList(0, mid);
        List<Student> right = students.subList(mid, students.size());

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> merged = new ArrayList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0).GetID() < right.get(0).GetID()) {
                merged.add(left.remove(0));
            } else {
                merged.add(right.remove(0));
            }
        }

        merged.addAll(left);
        merged.addAll(right);

        return merged;
    }
}