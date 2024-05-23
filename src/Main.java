public class Main {
    public static void main(String[] args) {
        Figuras_geometricas mifigura = new Figuras_geometricas();
        Circulo mifigura2 = new Circulo();
        Cuadrilatero mifigura3 = new Cuadrilatero();
        Triangulo mifigura4 = new Triangulo();


        Circulo mifigura5 = new Circulo(3.00);
        Cuadrilatero mifigura6 = new Cuadrilatero(6.00, 8.00);
        Triangulo mifigura7 = new Triangulo(8.00, 6.00);
        mifigura2.setNombre("pileta del CEC");
        System.out.println(mifigura2.getNombre());

        System.out.println("La nueva pileta del CEC tendra un radio ");
        mifigura2.setRadio(4.00);
        System.out.println(mifigura2.getRadio());
    }


}