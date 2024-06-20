
package co.edu.uniminuto.entitys;

import co.edu.uniminuto.interfaces.IEmpleados.Empleado;

class Mecanico extends co.edu.uniminuto.entitys.Empleado {
    private double precioPorTrabajo;
    private int numeroDeTrabajos;

    public Mecanico(String identificacion, String nombre, String departamento, String puesto, double sueldoFijo, double precioPorTrabajo, int numeroDeTrabajos) {
        super(identificacion, nombre, departamento, puesto, sueldoFijo);
        this.precioPorTrabajo = precioPorTrabajo;
        this.numeroDeTrabajos = numeroDeTrabajos;
    }
    }
