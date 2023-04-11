package EjFigurasGeometricas;
public class Triangulo extends FigurasGeometricas{
    public static double calcularArea(double a,double b) {
        return (b * a / 2);
    }
    public static double calcularPerimetro(double a, double b, double c) {
        return (b+ a + c);
    }
    public static double calcularHipotenusa(double a,double b) {
        return Math.pow(b*b + a*a, 0.5);
    }
    public static String determinarTipoTriángulo(double a,double b, double c) {
    String A;
    if ((b == a) && (b == c) && (a == c)) {
        A = "Es un triángulo equilátero"; 
    } else if ((b != a) && (b != c) && (a != c)) {
        A = "Es un triángulo escaleno"; 
    } else {
        A = "Es un triángulo isósceles";
        }
    return A;
    }
}
