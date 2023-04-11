package Capitulo3Ej18;

public class Empleado {
    
    public static double CalcularSB(double H,double V){
       
        double SB = H * V;
        return SB;
    }
    public static double CalcularRF(double SB,double P){
       
        double RF = SB * (P / 100);
        return RF;

    }
    public static double CalcularSN(double SB,double RF){
       
        double SN = SB - RF;
        return SN;
    }
    
    
}
