package Zoo.Animale;

public class Tigre extends Animale{
    public Tigre(){
        super.setSalute(100);
        super.setEta(1);
        super.setTipo("Tigre");
    }

    void ruggito(){ System.out.println("waaarrr"); }
    void mangiaPezzoCarne(){ System.out.println("Sto mangiando un pezzo di carne");}

}
