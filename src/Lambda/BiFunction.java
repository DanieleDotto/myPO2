package Lambda;

@FunctionalInterface
public interface BiFunction<I1, I2, O> {
    O apply(I1 i1, I2 i2);
}
