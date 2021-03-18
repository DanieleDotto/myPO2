package Generics;

import java.util.ArrayList;
import java.util.Collection;


/*

    - An "in" variable serves up data to the code. Imagine a copy method with two arguments: copy(src, dest). The src argument provides the data to be copied, so it is the "in" parameter.
    - An "out" variable holds data for use elsewhere. In the copy example, copy(src, dest), the dest argument accepts data, so it is the "out" parameter.

    An "in" variable is defined with an upper bounded wildcard, using the extends keyword.
    An "out" variable is defined with a lower bounded wildcard, using the super keyword.
    In the case where the "in" variable can be accessed using methods defined in the Object class, use an unbounded wildcard.
    In the case where the code needs to access the variable as both an "in" and an "out" variable, do not use a wildcard.
*/
public class mainPrint {

    /* Type parameter */
    static <T> void printTCollection(Collection<T> c){
        for(T e : c){
            System.out.print(e + " ");
        }
        System.out.println();
    }


    /* Unbounded Wildcard */
    static void printCollection(Collection<?> c){
        for(Object e : c){
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /* Bounded Wildcard */
    static void printWildNumberCollection(Collection<? extends Number> c){
        for(Number e : c){
            System.out.print(e + " ");
        }
        System.out.println();
    }




    public static void main (String[] args){
        Collection<Integer> c = new ArrayList<>();
        Collection<Double> d = new ArrayList<>();
        Collection<Number> n = new ArrayList<>();

        c.add(12);
        c.add(1);
        c.add(33);

        d.add(23.);
        d.add(1.2);

        n.add(2);
        n.add(3f);
        n.add(5.);

        System.out.println("Type Parameter");
        printTCollection(c);

        System.out.println("Wildcard Unbounded");
        printCollection(c);


        System.out.println("Wildcard UpperBound");
        printWildNumberCollection(c);
        printWildNumberCollection(d);
        printWildNumberCollection(n);

    }
}
