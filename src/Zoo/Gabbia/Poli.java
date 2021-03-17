package Zoo.Gabbia;

import Zoo.Animale.Animale;

public class Poli extends Gabbia {
    private final String continente = "Antartide";


    public Poli(String nomeGabbia, Animale typeAnimals, int nAnimals){
        super.setNomeGabbia(nomeGabbia);
        super.setTypeAnimals(typeAnimals);
        super.setnAnimals(nAnimals);
        super.setTypeAnimalsString(typeAnimals.getTipo());
    }
}
