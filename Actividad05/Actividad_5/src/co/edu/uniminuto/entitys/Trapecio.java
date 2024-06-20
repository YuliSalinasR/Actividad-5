
package co.edu.uniminuto.entitys;
public abstract class Trapecio extends FiguraGeometrica {
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
    }