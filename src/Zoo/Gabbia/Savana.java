package Zoo.Gabbia;

import Zoo.Animale.Animale;

public class Savana extends Gabbia {

    private final String ambiente = "Africa";


    public Savana(String nomeGabbia, Animale typeAnimals, int nAnimals){
        super.setNomeGabbia(nomeGabbia);
        super.setTypeAnimals(typeAnimals);
        super.setnAnimals(nAnimals);
        super.setTypeAnimalsString(typeAnimals.getTipo());
    }



}
