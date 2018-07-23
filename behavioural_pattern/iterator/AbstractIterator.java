package behavioural_pattern.iterator;

public interface AbstractIterator {
    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getLastItem();
}
