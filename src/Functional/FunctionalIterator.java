package Functional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class FunctionalIterator {

    // Restituisce un iteratore di B dato un iteratore di A e applica la funzione f
    // per ogni elemento iterato SENZA SAPERE CHE STRUTTURA DATI STO ITERANDO.
    // NB: L'applicazione della funzione viene eseguita ad ogni iterazione(svolta dal chiamante)
    public static <A, B> Iterator<B> mapIterator(Iterator<A> it, Function<A, B> f){
        return new Iterator<B>() {
            @Override
            public boolean hasNext() {
                return it.hasNext();        // hasNext originale, senza alcuna modifica
            }

            @Override
            public B next() {
                return f.apply(it.next());  // applico f ad ogni chiamata di next
            }
        };
    }




    /*
    * Iteratore reverse:
    *   1a. Mediante metodo che fa uso di polimorfismo e subsumption (lista dritta, itero rovescio)
    *   1b. Mediante metodo che fa uso di polimorfismo e subsumption (lista rovescia, itero dritto)
    *   2.  Mediante una classe che estende la struttura dati ma che overrida l'iteratore
     */

    // NB: Nei casi 1 devo comunque consumare l'iteratore per sapere quanto è lunga l'iterazione
    // 1A - Inserimento elementi lista in coda, iterazione contraria
    public static <T> Iterator<T> revIterator1a(Iterator<T> it){
        List<T> list = new ArrayList<>();
        while(it.hasNext()){
            list.add(it.next());    // append
        }
        return new Iterator<T>() {  // iterazione contraria
            private int index = list.size() - 1;
            @Override
            public boolean hasNext() {
                return index>=0;
            }

            @Override
            public T next() {
                return list.get(index--);
            }
        };
    }

    //1B - Semplice, inverto la lista e itero normalmente
    public static <T> Iterator<T> revIterator1b(Iterator<T> it){
        List<T> list = new ArrayList<>();
        while(it.hasNext()){
            list.add(0, it.next()); // prepend
        }
        return list.iterator(); // iterazione normale
    }


    // 2
    public static class RevArrayList<T> extends ArrayList<T>{
        @Override
        public Iterator<T> iterator(){
            return new Iterator<T>() {
                private int index = RevArrayList.this.size() - 1;

                @Override
                public boolean hasNext() {
                    return index >= 0;
                }

                @Override
                public T next() {
                    return RevArrayList.this.get(index--);
                }
            };
        }
    }




    public static class StepArrayList<T> extends ArrayList<T>{
        private final int step;

        public StepArrayList(int step){
            this.step = step;
        }

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {
                private int index = step<0 ? StepArrayList.this.size()-1 : 0;
                @Override
                public boolean hasNext() {
                    return step<0 ? index>=0 : index<StepArrayList.this.size();
                }

                @Override
                public T next() {
                    T x = StepArrayList.this.get(index);
                    index += step;
                    return x;
                }
            };
        }
    }










    public static void main(String[] args){
        List<String> list = new RevArrayList<>();
        for (int i = 15; i < 19; i++) {
            String s = "Ciao da: " + i;
            list.add(s);    // la lista è composta dalle frasi della riga precedente
        }
        System.out.println(list.size());


        Function<String, Integer> f = (String s) -> s.hashCode();
        Iterator<String> its = list.iterator();  // iteratore normale, itera String
        Iterator<Integer> iti = mapIterator(its, f);    // iteratore di Integer

        while(iti.hasNext()){
            System.out.println(iti.next());
        }
    }

}
