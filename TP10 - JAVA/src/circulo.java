import java.util.Scanner;

public class circulo {
    private Double radio;

    public circulo() {
    }

    public circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public static void area(double radio){

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);

    }
    public static void circunferencia(double radio){

        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo con radio " + radio + " es: " + circunferencia);

    }
}
