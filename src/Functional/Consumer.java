package Functional;

@FunctionalInterface
public interface Consumer<I> {
    void accept(I x);
}
