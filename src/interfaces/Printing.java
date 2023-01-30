package interfaces;

@FunctionalInterface
public interface Printing<String, T> {
    void out(String description, T value);
}
