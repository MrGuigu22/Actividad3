package EjFigurasGeometricas;
public class Circulo extends FigurasGeometricas {

    public static double calcularArea(double r) {
        return Math.PI*Math.pow(r,2);
    }
    public static double calcularPerímetro(double r) {
        return 2*Math.PI*r;
    }
}
