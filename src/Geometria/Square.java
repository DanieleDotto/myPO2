package Geometria;

public class Square {
    private final double lato;
    private double perimetro;
    private double area;

    public Square(double lato){
        this.lato = lato;
        this.perimetro = calcPerimetro(lato);
        this.area = calcArea(lato);
    }


    private double calcPerimetro(double lato) { return 4*lato; }
    private double calcArea(double lato) { return lato*lato; }

    /* Getters */
    public double getLato() { return lato; }
    public double getPerimetro() { return perimetro; }
    public double getArea() { return area; }
}
