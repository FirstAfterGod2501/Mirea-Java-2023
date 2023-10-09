public class MyArray<T> {
    private T[] array;

    public MyArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        return array[index];
    }
}