import java.util.Collection;

public interface IWaitList<T> {
    void add(T element);

    void remove(T element);

    boolean contains(T element);

    boolean containsAll(Collection<T> elements);

    boolean isEmpty();
}
