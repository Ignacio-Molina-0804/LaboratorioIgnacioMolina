import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        perro p1 = new perro();
        circulo p2 = new circulo();
        libro p3 = new libro();
        cuentaBancaria p4 = new cuentaBancaria();
        rectangulo p5 = new rectangulo();
        coche p6 = new coche();
        pelicula p7 = new pelicula();

        /*
        p1.setNombre("Pepe");
        p1.setEdad(10);
        p1.setRaza("Caniche");

        System.out.println(p1.getNombre() + ", " + p1.getEdad() + ", " + p1.getRaza());

        p1.ladrar();
        */

        /*
        System.out.println("Colocar el radio del circulo para conseguir su area y circunferencia: ");
        double radio = scanner.nextDouble();
        p2.setRadio(radio);

        System.out.println("---");

        p2.area(p2.getRadio());
        System.out.println("---");
        p2.circunferencia(p2.getRadio());
         */


        /*
        p3.setAutor("Pepito El Escritor");
        p3.setAniodepublicacion(2010);
        p3.setTitulo("Las aventuras de Pepito");

        p3.infoLibro(p3.getAutor(), p3.getTitulo(), p3.getAniodepublicacion());
        */

        /*
        p4.setNumCuenta(123456);

        System.out.println(p4.getNumCuenta() + ", Ingresa el monto que tienes en la cuenta.");
        double saldo = scanner.nextDouble();
        p4.setSaldo(saldo);

        System.out.println("---------------");
        System.out.println(p4.getNumCuenta() + ", Ingresa el monto que quieras ingresar en la cuenta.");
        double deposito = scanner.nextDouble();
        System.out.println("---------------");
        p4.setSaldo(p4.depositar(p4.getSaldo(), p4.getNumCuenta(), deposito));
        System.out.println("---------------");
        System.out.println("Saldo: " + p4.getSaldo());
        System.out.println("---------------");

        System.out.println("---------------");
        System.out.println(p4.getNumCuenta() + ", Ingresa el monto que quieras ingresar en la cuenta.");
        double retiro = scanner.nextDouble();
        System.out.println("---------------");
        p4.setSaldo(p4.retirar(p4.getSaldo(), p4.getNumCuenta(), retiro));
        System.out.println("---------------");
        System.out.println("Saldo: " + p4.getSaldo());
        System.out.println("---------------");
        */

        /*
        p5.setAlto(16.3);
        p5.setAncho(18.9);
        System.out.println("---------------");
        p5.area(p5.getAncho(), p5.getAlto());
        p5.perimetro(p5.getAncho(), p5.getAlto());
        System.out.println("---------------");
        */

        /*

        p6.setMarca("PepitoCar");
        p6.setModelo("PepitoRunning678");
        p6.setAnio(2020);

        System.out.println("Marca: " + p6.getMarca());
        System.out.println("Modelo: " + p6.getModelo());
        System.out.println("Año de fabricación: " + p6.getAnio());

        p6.acelerar(20);
        p6.frenar(10);

        */

        /*

        p7.mostrarInformacion();

         */
    }

}


