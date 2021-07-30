package generics.interfaces;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {
    private Comparator<T> comparator;

    public ReverseComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(T left, T right) {
        return -1 * comparator.compare(left, right);
    }
}
