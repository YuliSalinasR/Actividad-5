
package co.edu.uniminuto.entitys;

public class Vendedor extends Empleado {
    private double precioPorAuto;
    private int numeroDeAutosVendidos;

    public Vendedor(String identificacion, String nombre, String departamento, String puesto, double sueldoFijo, double precioPorAuto, int numeroDeAutosVendidos) {
        super(identificacion, nombre, departamento, puesto, sueldoFijo);
        this.precioPorAuto = precioPorAuto;
        this.numeroDeAutosVendidos = numeroDeAutosVendidos;
    }

    @Override
    public double calcularSalario() {
        return sueldoFijo + (precioPorAuto * numeroDeAutosVendidos);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() +
                ", precioPorAuto=" + precioPorAuto +
                ", numeroDeAutosVendidos=" + numeroDeAutosVendidos +
                '}';
    }
}

