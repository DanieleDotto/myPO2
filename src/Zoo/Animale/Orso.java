package Zoo.Animale;

public class Orso extends Animale{
    public Orso(){
        super.setSalute(100);
        super.setEta(1);
        super.setTipo("Orso");
    }

    void ruggito(){ System.out.println("Roooorrr"); }
    void mangiaPesce(){ System.out.println("Sto mangiando un pesce");}

}
