package Capitulo4Ej10;
public class DatosDeCobro {
    public static double Cobro(double a , double b){
      double C = 50000; 
      if (a > 2000000 && b > 3) {
         C += a * 0.03;      
        }  
      return C;
    }
}