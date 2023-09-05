public class InsertionSort {

    void sort(Student[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i].GetID();
            int j = i - 1;

            while (j >= 0 && arr[j].GetID() > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1].SetID(key);
        }
    }
};