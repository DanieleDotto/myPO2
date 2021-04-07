package Lambda;

@FunctionalInterface
public interface Function<I, O> {
    O apply(I x);
}
