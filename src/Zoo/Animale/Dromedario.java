package Zoo.Animale;

public class Dromedario extends Animale{
    public Dromedario(){
        super.setSalute(100);
        super.setEta(1);
        super.setTipo("Dromedario");
    }

    void camminaAcqua(){ System.out.println("Cammino verso l'acqua"); }
}
