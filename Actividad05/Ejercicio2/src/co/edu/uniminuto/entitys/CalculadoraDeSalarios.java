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

    @Override
    public String toString() {
        return "Empleado{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", puesto='" + puesto + '\'' +
                ", sueldoFijo=" + sueldoFijo +
                '}';
    }
}

class Mecanico extends Empleado {
    private double precioPorTrabajo;
    private int numeroDeTrabajos;

    public Mecanico(String identificacion, String nombre, String departamento, String puesto, double sueldoFijo, double precioPorTrabajo, int numeroDeTrabajos) {
        super(identificacion, nombre, departamento, puesto, sueldoFijo);
        this.precioPorTrabajo = precioPorTrabajo;
        this.numeroDeTrabajos = numeroDeTrabajos;
    }

    @Override
    public double calcularSalario() {
        return sueldoFijo + (precioPorTrabajo * numeroDeTrabajos);
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                super.toString() +
                ", precioPorTrabajo=" + precioPorTrabajo +
                ", numeroDeTrabajos=" + numeroDeTrabajos +
                '}';
    }
}

class Vendedor extends Empleado {
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

public class CalculadoraDeSalarios {

    public static void mostrarMenu() {
        System.out.println("Seleccione el tipo de empleado para calcular el salario:");
        System.out.println("1. Administrativo");
        System.out.println("2. Mecanico");
        System.out.println("3. Vendedor");
        System.out.println("4. Salir");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            System.out.print("Ingrese su opcion (1-4): ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la identificacion del administrativo: ");
                    String idAdmin = scanner.nextLine();
                    System.out.print("Ingrese el nombre del administrativo: ");
                    String nombreAdmin = scanner.nextLine();
                    System.out.print("Ingrese el departamento del administrativo: ");
                    String departamentoAdmin = scanner.nextLine();
                    System.out.print("Ingrese el puesto del administrativo: ");
                    String puestoAdmin = scanner.nextLine();
                    System.out.print("Ingrese el sueldo fijo del administrativo: ");
                    double sueldoFijoAdmin = scanner.nextDouble();

                    Empleado administrativo = new Empleado(idAdmin, nombreAdmin, departamentoAdmin, puestoAdmin, sueldoFijoAdmin);
                    System.out.println("Empleado: Administrativo");
                    System.out.println(administrativo);
                    System.out.println("Salario: " + administrativo.calcularSalario());
                    break;

                case 2:
                    System.out.print("Ingrese la identificacion del mecanico: ");
                    String idMecanico = scanner.nextLine();
                    System.out.print("Ingrese el nombre del mecanico: ");
                    String nombreMecanico = scanner.nextLine();
                    System.out.print("Ingrese el departamento del mecanico: ");
                    String departamentoMecanico = scanner.nextLine();
                    System.out.print("Ingrese el puesto del mecanico: ");
                    String puestoMecanico = scanner.nextLine();
                    System.out.print("Ingrese el sueldo fijo del mecanico: ");
                    double sueldoFijoMecanico = scanner.nextDouble();
                    System.out.print("Ingrese el precio por trabajo del mecanico: ");
                    double precioPorTrabajo = scanner.nextDouble();
                    System.out.print("Ingrese el numero de trabajos realizados: ");
                    int numeroDeTrabajos = scanner.nextInt();

                    Mecanico mecanico = new Mecanico(idMecanico, nombreMecanico, departamentoMecanico, puestoMecanico, sueldoFijoMecanico, precioPorTrabajo, numeroDeTrabajos);
                    System.out.println("Empleado: Mecanico");
                    System.out.println(mecanico);
                    System.out.println("Salario: " + mecanico.calcularSalario());
                    break;

                case 3:
                    System.out.print("Ingrese la identificacion del vendedor: ");
                    String idVendedor = scanner.nextLine();
                    System.out.print("Ingrese el nombre del vendedor: ");
                    String nombreVendedor = scanner.nextLine();
                    System.out.print("Ingrese el departamento del vendedor: ");
                    String departamentoVendedor = scanner.nextLine();
                    System.out.print("Ingrese el puesto del vendedor: ");
                    String puestoVendedor = scanner.nextLine();
                    System.out.print("Ingrese el sueldo fijo del vendedor: ");
                    double sueldoFijoVendedor = scanner.nextDouble();
                    System.out.print("Ingrese el precio por auto vendido: ");
                    double precioPorAuto = scanner.nextDouble();
                    System.out.print("Ingrese el numero de autos vendidos: ");
                    int numeroDeAutosVendidos = scanner.nextInt();

                    Vendedor vendedor = new Vendedor(idVendedor, nombreVendedor, departamentoVendedor, puestoVendedor, sueldoFijoVendedor, precioPorAuto, numeroDeAutosVendidos);
                    System.out.println("Empleado: Vendedor");
                    System.out.println(vendedor);
                    System.out.println("Salario: " + vendedor.calcularSalario());
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}

