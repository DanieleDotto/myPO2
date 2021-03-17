package Zoo.Animale;

public class Pinguino extends Animale{
    public Pinguino(){
        super.setSalute(100);
        super.setEta(1);
        super.setTipo("Pinguino");
    }

    void cammina(){ System.out.println("Sto camminando"); }

}
