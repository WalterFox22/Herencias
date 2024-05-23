public class Triangulo extends Figuras_geometricas {
    double base;
    double altura;
    public Triangulo(double base, double altura) {}
    public Triangulo() {};

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea() {
        return (base*altura)/2;
    }
}