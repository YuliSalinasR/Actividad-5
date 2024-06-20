
package co.edu.uniminuto.interfaces;

public interface IEmpleados {
public class Empleado {

        private String identificacion;
    public double calcularSalario() {
        double sueldoFijo = 0;
        return sueldoFijo;
    }
    public String toString() {
            String nombre = null;
            String departamento = null;
            String puesto = null;
            String sueldoFijo = null;
        return "Empleado{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", puesto='" + puesto + '\'' +
                ", sueldoFijo=" + sueldoFijo +
                '}';
    }
}
}

