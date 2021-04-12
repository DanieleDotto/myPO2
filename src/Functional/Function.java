package Functional;

@FunctionalInterface
public interface Function<I, O> {
    O apply(I x);
}
