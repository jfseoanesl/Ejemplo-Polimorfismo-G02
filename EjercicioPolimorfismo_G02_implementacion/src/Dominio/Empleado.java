package Dominio;

public abstract class Empleado {

    public Empleado() {
    }
    
    public abstract double getLiquidacionMes();
            
    public double getPrimas(){
      return 0;
    }
}
