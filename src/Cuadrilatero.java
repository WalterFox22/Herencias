public class Cuadrilatero extends Figuras_geometricas{
    Double largo;
    Double ancho;
    public Cuadrilatero(double largo, double ancho){};
    public Cuadrilatero(){};

    public Double getLargo() {
        return largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    public double calcularArea(){
        return largo * ancho;
    }
}