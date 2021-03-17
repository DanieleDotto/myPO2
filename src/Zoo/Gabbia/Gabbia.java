package Zoo.Gabbia;

import Zoo.Animale.Animale;

public abstract class Gabbia {

    /* Caratteristiche */
    private String nomeGabbia;
    private Animale typeAnimals;
    private String typeAnimalsString;
    private int nAnimals;

    String getNomeGabbia() { return nomeGabbia; }
    void setNomeGabbia(String nomeGabbia) { this.nomeGabbia = nomeGabbia; }
    
    Animale getTypeAnimals() { return typeAnimals; }
    void setTypeAnimals(Animale typeAnimals) { this.typeAnimals = typeAnimals; }
    
    int getnAnimals() { return this.nAnimals; }
    void setnAnimals(int n) { this.nAnimals = n; }


    /* Lavori */
    private String[] lavori;
    private int nLavori = 0;

    void setLavoro(String lavoro) { this.lavori[nLavori++] = lavoro; }
    String getLavoro(int i) { return this.lavori[i]; }

    int getnLavori(){ return this.nLavori; }

    public String getTypeAnimalsString() {
        return typeAnimalsString;
    }

    public void setTypeAnimalsString(String typeAnimalsString) {
        this.typeAnimalsString = typeAnimalsString;
    }
}
