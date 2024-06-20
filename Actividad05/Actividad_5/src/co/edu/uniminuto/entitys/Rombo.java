
package co.edu.uniminuto.entitys;
public abstract class Rombo extends FiguraGeometrica {
    private double diagonalMayor;
    private double diagonalMenor;
    

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
    
    public String nombre() {
        return "Rombo";
    }
}
