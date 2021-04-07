package Lambda;

@FunctionalInterface
public interface Supplier<O> {
    O get();
}
