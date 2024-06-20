
package co.edu.uniminuto.entitys;

import java.util.Scanner;


class Empleado {
    protected String identificacion;
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldoFijo;

    public Empleado(String identificacion, String nombre, String departamento, String puesto, double sueldoFijo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldoFijo = sueldoFijo;
    }

    public double calcularSalario() {
        return sueldoFijo;
    }
    }
