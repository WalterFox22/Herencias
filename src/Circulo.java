public class Circulo extends Figuras_geometricas {
    double radio;
    public Circulo(double radio) {}
    public Circulo(){};

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public  double calcularArea() {
        return Math.PI * radio * radio;
    }
}
