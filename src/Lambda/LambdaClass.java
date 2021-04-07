package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaClass {

    public static int f(int n, Function<Integer, Integer> f){
        return f.apply(n);
    }

    public static double d(double n, Function<Double, Double> f) { return f.apply(n); }

    public static boolean nomeCognome(String name, String surname, BiFunction<String, String, Boolean> f) { return f.apply(name, surname); }
    public static boolean identifica(String name, String surname, int eta, TriFunction<String, String, Integer, Boolean> f) { return f.apply(name, surname, eta); }

    public static void g(int n, Consumer<Integer> c){
        c.accept(n);
    }

    public static int s(Supplier<Integer> s){
        return s.get();
    }

    public static void r(Runnable r){
        r.run();
    }


    public static int increment(int n){
        return n + 1;
    }

    public int decrement(int n){
        return n - 1;
    }


    /* Named class */
    public static class decrementFun implements Function<Integer, Integer> {
        @Override
        public Integer apply(Integer x) {
            return x - 1;
        }
    }


    /* Funzione map */
    public static <I, O> List<O> map(Iterable<I> c, Function<I, O> f){
        List<O> out = new ArrayList<>();
        for(I elem: c){
            out.add(f.apply(elem));
        }
        return out;
    }

    public static void main(String[] main){

        /* Metodo statico - Tecnica: method reference */
        int n = 1;
        //System.out.println("Pre funzione: " + n);
        Function<Integer, Integer> increment = LambdaClass::increment;
        int m = f(n, increment);
        //System.out.println("Post funzione: " + m);

        /* Named Class */
        int y = 5;
        //System.out.println("Pre funzione: " + y);
        int k = f(y, new decrementFun());
        //System.out.println("Post funzione: " + k);


        /* Anonymous Class */
        int p = 40;
        //System.out.println("Pre funzione: " + p);
        int z = f(p, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*2;
            }
        });
        //System.out.println("Post funzione: " + z);


        /* Lambda zuccherate ad Anonymous Class */
        int q = 88;
        //System.out.println("Pre funzione: " + q);
        int l = f(q, (x) -> x*3);
        //int l1 = f(q, (x) -> {x++; x=x*2; return x*3; });
        //System.out.println("Post funzione: " + l);


        /* Invocazione di map */
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i*3);
            //System.out.println(arr.get(i));
        }

        List<Integer> list = map(arr, increment);
        for (int i = 0; i < 10; i++) {
            //System.out.println(list.get(i));
        }


        /* Method reference dinamico */
        LambdaClass myClass = new LambdaClass();
        Function<Integer, Integer> myFun = myClass::decrement;
        int t = 666;
        //System.out.println(t);
        int post = f(t, myFun);
        //System.out.println(post);

        /* Anonymous Class dinamico */
        int ad = f(t, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x - 100;
            }
        });
        //System.out.println(ad);



        /* Lambda dinamico */
        int ld = f(t, (x) -> x + 10000);
        //System.out.println(ld);

        List<Integer> li = new ArrayList<>();
        li.add(40);
        li.add(400);
        li.add(4000);

        li = map(li, (x -> {
            if(x == 40){
                x = x*200;
            }
            else{
                x = x+200;
            }
            return x;
        }));

        {
            int rrr = 2;
            int rr = f(rrr, (x) -> x == 1 ? x + 1 : x - 1);
            System.out.println(rr);
        }

        {
            double rrr = 2.2;
            double rr = d(rrr, (x)-> x==2.2 ? x*2 : x/2);
            System.out.println(rr);
        }

        {   // BiFunction
            Scanner input = new Scanner(System.in);
            System.out.print("Inserisci il tuo nome: "); String name = input.nextLine();
            System.out.print("Inserisci il tuo cognome: "); String surname = input.nextLine();

            boolean isDaniele = nomeCognome(name, surname, (x, c) -> x.equals("Daniele") && c.equals("Dotto"));
            System.out.println(isDaniele);
        }

        {   // TriFunction
            Scanner input = new Scanner(System.in);
            System.out.print("Inserisci il tuo nome: "); String name = input.nextLine();
            System.out.print("Inserisci il tuo cognome: "); String surname = input.nextLine();
            System.out.print("Inserisci l'età: "); int eta = input.nextInt();

            boolean isThatDaniele = identifica(name, surname, eta, (n1, n2, n3)-> n1.equals("Daniele") && n2.equals("Dotto") && eta==22);
            System.out.println(isThatDaniele);
        }
    }
}
