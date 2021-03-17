package Zoo.Animale;

public class Leone extends Animale{
    public Leone(){
        super.setSalute(100);
        super.setEta(1);
        super.setTipo("Leone");
    }

    void ruggito(){ System.out.println("Roarrr"); }
    void mangiaCarne(){ System.out.println("Sto mangiando carne");}

}
