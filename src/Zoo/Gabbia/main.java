package Zoo.Gabbia;

import Zoo.Animale.*;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args){
        ArrayList<Gabbia> all = new ArrayList<>();

        Animale lion = new Leone();
        Animale tiger = new Tigre();
        Animale pinguin = new Pinguino();
        Animale bear = new Orso();
        Animale coyote = new Coyote();
        Animale dromedario = new Dromedario();
        Animale bigLion = new Leone();
        Animale smallLion = new Leone();

        Savana s1 = new Savana("s1", lion, 5);
        Savana s2 = new Savana("s2", tiger, 8);
        Savana s3 = new Savana("s3", bigLion, 2);
        Savana s4 = new Savana("s3", smallLion, 2);

        Poli p1 = new Poli("p1", pinguin, 10);
        Poli p2 = new Poli("p2", bear, 3);

        Deserto d1 = new Deserto("d1", coyote, 6);
        Deserto d2 = new Deserto("d2", dromedario, 2);

        all.add(s1);
        all.add(s2);
        all.add(p1);
        all.add(p2);
        all.add(d1);
        all.add(d2);
        all.add(s3);
        all.add(s4);

        Iterator<Gabbia> it = all.iterator();
        while(it.hasNext()){
            Gabbia m = it.next();
            if(m.equals(p2)) {System.out.print("Trovati gli orsi: ");}
            System.out.println(m.getTypeAnimalsString());  // accesso ai campi di gabbia
        }
        System.out.println("Il numero di gabbie a tua disposizione sono: " + all.size());
    }
}
