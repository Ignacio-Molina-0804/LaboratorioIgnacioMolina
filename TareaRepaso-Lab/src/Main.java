import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Introduzca un número de tres cifras: ");
        int num = sc.nextInt();

        if (num < 100 && num > 999) {

            System.out.println("El número ingresado no es valido...");

        } else {

            int cif1 = num / 100;
            int cif2 = num % 10;

            if (cif1 == cif2) {

                System.out.println("El número igresado '"+ num +"' es capicúa");

            } else {

                System.out.println("El número igresado '"+ num +"' no es capicúa");

            }

        }

    }
}