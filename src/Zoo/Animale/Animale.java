package Zoo.Animale;

public abstract class Animale {
    private int salute;
    private int eta;
    private String tipo;


    int getSalute() { return salute; }
    void setSalute(int salute) { this.salute = salute; }

    int getEta() { return eta; }
    void setEta(int eta) { this.eta = eta; }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
