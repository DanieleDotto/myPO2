package Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LambdaCollection<I, O> {


    public static int increase(int n){
        return n + 1;
    }

    public static void azzera(List<Integer> l){
        for(int elem: l){
            elem = 0;
        }
    }

    public static void main(String[] main){
        ArrayList<Integer> c = new ArrayList<>();
        c.add(5);
        c.add(50);
        c.add(500);
        c.add(5000);

    }
}
