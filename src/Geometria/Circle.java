package Geometria;

public class Circle {
    private static final double PI = 3.14;
    private final double raggio;
    private double diametro;
    private double circonferenza;
    private double area;

    public Circle(double raggio){
        this.raggio = raggio;
        this.diametro = calcDiametro(raggio);
        this.circonferenza = calcCirconferenza(raggio);
        this.area = calcArea(raggio);
    }

    private double calcDiametro(double raggio) { return 2*raggio; }
    private double calcCirconferenza(double diametro) { return 2*PI*raggio; }
    private double calcArea(double area) { return PI*raggio*raggio; }

    /* Getters */
    public double getRaggio() { return raggio; }
    public double getDiametro() { return diametro; }
    public double getCirconferenza() { return circonferenza; }
    public double getArea() { return area; }
}
