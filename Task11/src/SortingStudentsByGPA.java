package Task11.src;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    public void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(students, low, high);
            quickSort(students, low, partitionIndex - 1);
            quickSort(students, partitionIndex + 1, high);
        }
    }

    private int partition(Student[] students, int low, int high) {
        double pivot = students[high].getGPA();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students[j], students[high]) > 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}