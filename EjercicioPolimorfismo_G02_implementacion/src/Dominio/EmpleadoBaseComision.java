package Dominio;

public class EmpleadoBaseComision extends EmpleadoPorComision {
    private double sBase;

    public EmpleadoBaseComision(double sBase, double vMes, double pComision) {
        super(vMes, pComision);
        this.sBase = sBase;
    }

    /**
     * @return the sBase
     */
    public double getsBase() {
        return sBase;
    }

    /**
     * @param sBase the sBase to set
     */
    public void setsBase(double sBase) {
        this.sBase = sBase;
    }
    
    @Override
    public double getLiquidacionMes(){
        return super.getLiquidacionMes() + this.sBase;
    }
    
    
}
