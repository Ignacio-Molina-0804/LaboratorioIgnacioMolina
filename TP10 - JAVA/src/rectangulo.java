public class rectangulo {

    private double ancho;
    private double alto;

    public rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.alto = largo;
    }

    public rectangulo() {
    }

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public static void area(double ancho, double alto) {

        double area = ancho * alto;
        System.out.println("El area del rectangulo es: " + area);

    }

    public static void perimetro(double ancho, double alto) {

        double perimetro = (ancho * 2) + (alto * 2);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

    }

}



