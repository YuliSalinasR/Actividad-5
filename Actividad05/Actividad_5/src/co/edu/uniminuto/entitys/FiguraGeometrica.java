
package co.edu.uniminuto.entitys;

import co.edu.uniminuto.intefaces.IFiguraGeometrica;
import java.util.Scanner;

public abstract class FiguraGeometrica implements IFiguraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Seleccione una figura para calcular su area:");
            System.out.println("1. Trapecio");
            System.out.println("2. Rombo");
            System.out.println("3. Paralelogramo");
            System.out.println("4. Salir");

        while (true) {

            System.out.print("Ingrese su opcion (1-4): ");
            int opcion = scanner.nextInt();
                switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base mayor del trapecio: ");
                    double baseMayor = scanner.nextDouble();
                    System.out.print("Ingrese la base menor del trapecio: ");
                    double baseMenor = scanner.nextDouble();
                    System.out.print("Ingrese la altura del trapecio: ");
                    double alturaTrapecio = scanner.nextDouble();
                    Trapecio trapecio = new Trapecio(baseMayor, baseMenor, alturaTrapecio) {
                @Override
                public void calcularOtro() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public String nombre() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
                    System.out.println("Figura: Trapecio");
                    System.out.println("Area: " + trapecio.calcularArea());
                    break;

                case 2:
                    System.out.print("Ingrese la diagonal mayor del rombo: ");
                    double diagonalMayor = scanner.nextDouble();
                    System.out.print("Ingrese la diagonal menor del rombo: ");
                    double diagonalMenor = scanner.nextDouble();
                    Rombo rombo = new Rombo(diagonalMayor, diagonalMenor) {
                @Override
                public void calcularOtro() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
                    System.out.println("Figura: Rombo");
                    System.out.println("Área: " + rombo.calcularArea());
                    break;

                case 3:
                    System.out.print("Ingrese la base del paralelogramo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del paralelogramo: ");
                    double alturaParalelogramo = scanner.nextDouble();
                    Paralelogramo paralelogramo = new Paralelogramo(base, alturaParalelogramo) {
                @Override
                public void calcularOtro() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
                    System.out.println("Figura: Paralelogramo");
                    System.out.println("Area: " + paralelogramo.calcularArea());
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
}    


  
    