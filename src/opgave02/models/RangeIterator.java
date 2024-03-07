package opgave02.models;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private int from;
    private int to;
    private int current;

    public RangeIterator(int from, int to) {
        this.from = from;
        this.to = to;
        current = from;
    }

    @Override
    public boolean hasNext() {
        if (current < to-1) {
            current++;
            return true;
        }

        return false;
    }

    @Override
    public Integer next() {
        return current;
    }
}
