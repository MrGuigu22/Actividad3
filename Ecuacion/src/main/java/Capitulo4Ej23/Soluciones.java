package Capitulo4Ej23;
public class Soluciones {
    public static String Solucion(double a, double b, double c){
        double D = b * b - 4 * a * c;        
        String L ;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
           L = x1 + "," + x2;
        } 
        else if (D == 0) {
            double x = -b / (2 * a);
            L = x + ".";      
        } 
        else {
            L = "La ecuacion no tiene soluciones.";            
        }   
        return L;
    }
}
