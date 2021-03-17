package Zoo.Animale;

public class Coyote extends Animale{
    public Coyote(){
        super.setSalute(100);
        super.setEta(1);
        super.setTipo("Coyote");
    }

    void corri(){ System.out.println("Sto correndo"); }

}
