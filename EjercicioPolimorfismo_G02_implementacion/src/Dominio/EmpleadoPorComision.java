
package Dominio;

public class EmpleadoPorComision extends Empleado {
    private double vMes, pComision;

    public EmpleadoPorComision(double vMes, double pComision) {
        this.vMes = vMes;
        this.pComision = pComision;
    }

    /**
     * @return the vMes
     */
    public double getvMes() {
        return vMes;
    }

    /**
     * @param vMes the vMes to set
     */
    public void setvMes(double vMes) {
        this.vMes = vMes;
    }

    /**
     * @return the pComision
     */
    public double getpComision() {
        return pComision;
    }

    /**
     * @param pComision the pComision to set
     */
    public void setpComision(double pComision) {
        this.pComision = pComision;
    }

    @Override
    public double getLiquidacionMes() {
        return this.vMes * this.pComision;
    }
    
    
}
