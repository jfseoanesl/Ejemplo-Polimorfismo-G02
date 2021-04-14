package test;

import Dominio.*;

public class Test {
    public static void main(String[] args) {
        
        
        Empleado listaEmpleados[] = new Empleado[6];
        
        Empleado juan = new EmpleadoAsalariado(700); // upcasting
        listaEmpleados[0]=juan;
        Empleado jose = new EmpleadoPorHora(100, 120, 50);
        listaEmpleados[1]=jose;
        Empleado luis = new EmpleadoAsalariado(900);
        listaEmpleados[2]=luis;
        Empleado diana = new EmpleadoPorHora(80, 150, 40);
        listaEmpleados[3]=diana;
        Empleado paty = new EmpleadoPorComision(50000, 0.12);
        listaEmpleados[4]=paty;
        Empleado carlos = new EmpleadoBaseComision(1000, 50000, 0.12);
        listaEmpleados[5]=carlos;
        
        totalNomina(listaEmpleados);
                
    }
    
    public static void totalNomina(Empleado lista[]){
        double totalNomina=0;
        double totalNominaAsalariado=0;
        double totalNominaPorHora=0;
        double restoEmpleados=0;
        int n=1;
        for(Empleado e:lista){
            if(e instanceof EmpleadoAsalariado){
                totalNominaAsalariado+=e.getLiquidacionMes();
            }
            else if(e instanceof EmpleadoPorHora){
                totalNominaPorHora+=e.getLiquidacionMes();
            }
            else{
                restoEmpleados+=e.getLiquidacionMes();
            }
            totalNomina+=e.getLiquidacionMes();
            System.out.print("Empleado " + n + "  ");
            imprimirLiquidacionMes(e);
            n++;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total asalariados: " + totalNominaAsalariado);
        System.out.println("Total por horas: " + totalNominaPorHora);
        System.out.println("Total resto: " + restoEmpleados);
        System.out.println("---------------------------------------------");
        System.out.println("Total empleados liquidados: " + lista.length);
        System.out.println("Total liquidado(Nomina): " + totalNomina);
        
    }
    
    public static void imprimirLiquidacionMes(Empleado e){
        System.out.println("Liquidacion mes: " + e.getLiquidacionMes());
    }
}
