package Zoo.Gabbia;

import Zoo.Animale.Animale;

public class Deserto extends Gabbia{
    private final String continente = "Africa";


    public Deserto(String nomeGabbia, Animale typeAnimals, int nAnimals){
        super.setNomeGabbia(nomeGabbia);
        super.setTypeAnimals(typeAnimals);
        super.setnAnimals(nAnimals);
        super.setTypeAnimalsString(typeAnimals.getTipo());
    }
}
