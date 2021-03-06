package Functional;

@FunctionalInterface
public interface TriFunction<I1, I2, I3, O>{
    O apply(I1 i1, I2 i2, I3 i3);
}
