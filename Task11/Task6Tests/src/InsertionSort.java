package Task11.Task6Tests.src;

import Task11.src.Student;

import java.util.ArrayList;

public class InsertionSort {

    void sort(ArrayList<Student> arr)
    {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            int key = arr.get(i).GetID();
            int j = i - 1;

            while (j >= 0 && arr.get(j).GetID() > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.get(j + 1).SetID(key);
        }
    }
};