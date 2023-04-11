package EjFigurasGeometricas;
public class Rectangulo extends FigurasGeometricas {   

   public static double calcularArea(double b, double a){
       return b * a;
   }
   public static double calcularPerimetro(double b, double a) {
       return (2 * b) + (2 * a);
    }      
}
