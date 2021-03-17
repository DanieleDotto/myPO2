package Geometria;

import java.util.ArrayList;
import java.util.Iterator;

class main {
    public static void main(String[] args){
        Square q1 = new Square(5.5);
        Square q2 = new Square(3);

        System.out.println("Lato di q1: " + q1.getLato());
        System.out.println("Area di q1: " + q1.getArea());
        System.out.println("Perimetro di q1: " + q1.getPerimetro());

        System.out.println();

        System.out.println("Lato di q2: " + q2.getLato());
        System.out.println("Area di q2: " + q2.getArea());
        System.out.println("Perimetro di q2: " + q2.getPerimetro());


        System.out.println();
        System.out.println();


        Circle c1 = new Circle(8.5);
        Circle c2 = new Circle(3);

        System.out.println("Raggio di c1: " + c1.getRaggio());
        System.out.println("Diametro di c1: " + c1.getDiametro());
        System.out.println("Circonferenza di c1: " + c1.getCirconferenza());
        System.out.format("Area di c1: %.2f\n", c1.getArea());

        System.out.println();

        System.out.println("Raggio di c2: " + c2.getRaggio());
        System.out.println("Diametro di c2: " + c2.getDiametro());
        System.out.println("Circonferenza di c2: " + c2.getCirconferenza());
        System.out.format("Area di c2: %.2f\n", c2.getArea());

        System.out.println();





        /* Arraylist */

        ArrayList<Circle> t1 = new ArrayList<>();
        t1.add(c1);
        t1.add(c1);
        t1.add(c2);
        t1.add(c1);

        /* Foreach */
        for (Circle element: t1) {
            System.out.println(element.getRaggio());
        }
        System.out.println();

    }
}
