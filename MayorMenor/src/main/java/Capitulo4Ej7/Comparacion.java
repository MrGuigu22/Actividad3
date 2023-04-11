package Capitulo4Ej7;

public class Comparacion {
    
    public static String Comparar(double a, double b){
        String D;
        if (a > b) {
         D = "A es mayor que B.";
      } else if (a < b) {
         D ="A es menor que B.";
      } else {
         D ="A es igual a B.";
      }
       return D;
    }
}
