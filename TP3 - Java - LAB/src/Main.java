import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Podemos saber si un número es par si el resto de dividir el número entre 2 es igual a cero. En caso contrario
        número es impar. El operador Java que calcula el resto de la división entre dos números enteros o no es el
        operador %. (Punto 1)


        Scanner sc = new Scanner(System.in);

        int number1;

        System.out.print("Introduzca un número entero: ");
        number1 = sc.nextInt();

        if (number1 % 2 == 0) {

            System.out.println("El número ingresado es par");

        } else {

            System.out.println("El número ingresado es impar");

        } */

        /*Programa que lea un número entero y muestre si el número es múltiplo de 10. (Punto 2)

        Scanner sc = new Scanner(System.in);

        int number1;

        System.out.print("Introduzca un número entero: ");
        number1 = sc.nextInt();

        if (number1 % 10 == 0) {

            System.out.println("El número es multiplo de 10");

        } else {

            System.out.println("El número no es multiplo de 10");

        } */

        /*Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. (Punto 3)

        Scanner sc = new Scanner(System.in);

        char caracter;

        System.out.print("Introduzca un carácter: ");
        caracter = sc.next().charAt(0);

        if (Character.isUpperCase(caracter)) {

            System.out.println("El carácter colocado esta escrito en mayusculas");

        } else {

            System.out.println("El carácter colocado no esta escrito en mayusculas");

        } */

        /*Programa java que comprueba si dos números enteros son iguales o no. Los números a comprobar se introducen por teclado.
        (Punto 4)

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();

        if (num1 == num2) {

            System.out.println("Los números ingresados son iguales.");

        } else {

            System.out.println("Los números ingresados no son iguales.");

        } */


        /*Programa java para calcular el mayor de dos números enteros que se introducen por teclado. (Punto 5)

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();

        if (num1 > num2) {

            System.out.println("El primer número ingresado es mayor al segundo");

        } else if (num1 == num2) {

            System.out.println("Los dos números son iguales");

        } else {

            System.out.println("El segundo número ingresado es mayor al primero");

        } */



        /* Programa java para calcular si la última cifra de dos números enteros es la misma. (Punto 6)

        int num1;
        int num2;

        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();

        int ultNum1 = num1 % 10;
        int ultNum2 = num2 % 10;

        if (ultNum1 == ultNum2) {

            System.out.println("Las dos ultimas cifras son iguales.");

        } else {

            System.out.println("Las dos ultimas cifras no son iguales.");

        } */

        /* Programa java para calcular si un número entero es múltiplo de tres y de cinco. (Punto 7)

        int num1;
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();

        if (num1 % 3 == 0 && num1 % 5 == 0) {

            System.out.println("El número ingresado es multiplo de 3 y 5");

        } */

        /* Programa java para calcular si un número entero es múltiplo de dos o de tres. (Punto 8)

        int num1;
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();

        if (num1 % 2 == 0 || num1 % 3 == 0) {

            System.out.println("El número ingresado es multiplo de 2 o 3.");

        }*/

        /* . Programa que lea dos caracteres y compruebe si son iguales (Punto 9)

        char char1;
        char char2;

        System.out.print("Introduzca el primer caracter: ");
        char1 = sc.next().charAt(0);
        System.out.print("Introduzca el segundo caracter: ");
        char2 = sc.next().charAt(0);

        if (char1 == char2) {

            System.out.println("Los caracteres son iguales.");

        } */

        /* Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas (Punto 10)

        char char1;
        char char2;

        System.out.print("Introduzca el primer caracter: ");
        char1 = sc.next().charAt(0);
        System.out.print("Introduzca el segundo caracter: ");
        char2 = sc.next().charAt(0);

        char char1minus = Character.toLowerCase(char1);
        char char2minus = Character.toLowerCase(char2);


        if (char1 == char1minus && char2 == char2minus) {

            System.out.println("Los caracteres están en letras minusculas.");

        }
        */

        /* Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9). (Punto 11)

        System.out.print("Ingrese un carácter: ");
        char caracter = sc.next().charAt(0);

        if (caracter >= '0' && caracter <= '9') {
            System.out.println("El carácter ingresado es un dígito numérico.");
        } else {
            System.out.println("El carácter ingresado no es un dígito numérico.");
        } */

        /* Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero. (Punto 12)

        float num1;
        float num2;

        System.out.print("Ingrese el número a ser dividido: ");
        num1 = sc.nextFloat();
        System.out.print("Ingrese el divisor: ");
        num2 = sc.nextFloat();

        if (num2 == 0) {

            System.out.println("El número no puede ser dividido por 0.");

        } else {

            float division = num1 / num2;
            System.out.println("El resultado de la división es: " + division);

        } */

        /* Programa java para comprobar si un año es bisiesto. (Punto 13)

        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){

            System.out.println("Es un año bisiesto");

        } else {

            System.out.println("No es un año bisiesto");

        } */

        /* Programa java para comprobar si un número entero de tres cifras es capicúa. (Punto 14)

        System.out.print("Ingrese un número de 3 cifras: ");
        int capicua = sc.nextInt();

        if (capicua > 999 || capicua < 100) {

            System.out.println("El número ingresado no es un número de 3 cifras.");

        } else {

            int cifraInicio = capicua / 100;
            int cifraFinal = capicua % 10;

            if (cifraInicio == cifraFinal) {

                System.out.println("El número ingresado es capicúa. ");

            } else {

                System.out.println("El número ingresado no es capicúa. ");

            }

        } */

        /* Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida. (Punto 15)

        System.out.print("Ingrese hora: ");
        int H = sc.nextInt();
        System.out.print("Ingrese minutos: ");
        int M = sc.nextInt();
        System.out.print("Ingrese segundos: ");
        int S = sc.nextInt();

        if (H < 1 || H > 24 || M < 1 || M > 59 || S < 1 || S > 59 ){

            System.out.println("La hora ingresada es incorrecta.");

        } else {

            System.out.println("La hora ingresada es " + H + ":" + M + ":" + S);

        } */

        /* Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12. (Punto 16)

        System.out.print("Ingrese número del mes: ");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {

            System.out.println("El mes ingresado no existe.");

        } else {

            if (mes == 1) {

                System.out.println("El mes ingresado es Enero y tiene 31 días");

            } else if (mes == 2) {

                System.out.println("El mes ingresado es Febrero y tiene 28 días");

            } else if (mes == 3) {

                System.out.println("El mes ingresado es Marzo y tiene 31 días");

            } else if (mes == 4) {

                System.out.println("El mes ingresado es Abril y tiene 30 días");

            } else if (mes == 5) {

                System.out.println("El mes ingresado es Mayo y tiene 31 días");

            } else if (mes == 6) {

                System.out.println("El mes ingresado es Junio y tiene 30 días");

            } else if (mes == 7) {

                System.out.println("El mes ingresado es Julio y tiene 31 días");

            } else if (mes == 8) {

                System.out.println("El mes ingresado es Agosto y tiene 31 días");

            } else if (mes == 9) {

                System.out.println("El mes ingresado es Septiembre y tiene 30 días");

            } else if (mes == 10) {

                System.out.println("El mes ingresado es Octubre y tiene 31 días");

            } else if (mes == 11) {

                System.out.println("El mes ingresado es Noviembre y tiene 30 días");

            } else if (mes == 12) {

                System.out.println("El mes ingresado es Diciembre y tiene 31 días");

            }
        } */

        /* Programa java para convertir una calificación numérica en alfabética. (Punto 17)

        System.out.print("Ingrese la nota obtenida: ");
        float nota = sc.nextFloat();

        if (nota < 0 || nota > 10) {

            System.out.println("La nota ingresada no es valida");

        } else if (nota >= 0 && nota < 5) {

            System.out.println("Tiene una nota Insuficiente");

        } else if (nota >= 5 && nota < 6) {

            System.out.println("Tiene una nota Suficiente");

        } else if (nota >= 6  && nota < 7) {

            System.out.println("Tiene una nota Bien");

        } else if (nota >= 7 && nota < 9) {

            System.out.println("Tiene una nota Notable");

        } else if (nota >= 9 && nota == 10) {

            System.out.println("Tiene una nota Sobresaliente");

        } */

        /* Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando la instrucción while. (Punto 18)

        int num = 0;

        while (num < 100) {

            num += 1;
            System.out.println(num);

        } */

        /* . Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while. (Punto 19)

        int numero = 1;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 100); */

        /* Ejemplo de uso de for. Programa Java que muestre los números del 1 al 100 utilizando la instrucción for. (Punto 20)

        for (int numero = 1; numero <= 100; numero++) {
            System.out.println(numero);
        } */

        /* Ejemplo de uso de while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while. (Punto 21)

        int num = 101;

        while (num > 1) {

            num -= 1;
            System.out.println(num);

        } */

        /* Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while. (Punto 22)

        int numero = 101;

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 1); */

        /* Ejemplo de for. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for. (Punto 23)

        for (int numero = 100; numero >= 1; numero--) {
            System.out.println(numero);
        }  */

        /* 24. Escribe un programa Java que pida por teclado el valor de un número N y muestre por pantalla todos los números desde 1 hasta N. Resuelve este ejercicio de tres formas distintas: (Punto 24)
        1.      Utilizando la estructura for
        2.      Utilizando la estructura while
        3.      Utilizando la estructura do .. while

        System.out.print("Introduce un número N: ");
        int N = sc.nextInt();

        // Usando la estructura for
        System.out.println("Utilizando la estructura for:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Usando la estructura while
        System.out.println("Utilizando la estructura while:");
        int i = 1;
        while (i <= N) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Usando la estructura do .. while
        System.out.println("Utilizando la estructura do .. while:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= N); */

        // Pedir al usuario el valor de N

        /* Programa que pida que se introduzca por teclado el valor de un número entero N y muestre los números desde N hasta 1 ambos incluidos. Se debe resolver este ejercicio de tres formas distintas utilizando la estructura repetitiva: (Punto 25)
        1.      Utilizando la estructura for
        2.      Utilizando la estructura while
        3.      Utilizando la estructura do .. while


        System.out.print("Introduce un número entero N: ");
        int N = sc.nextInt();

        // Usando la estructura for
        System.out.println("Utilizando la estructura for:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Usando la estructura while
        System.out.println("Utilizando la estructura while:");
        int i = N;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        // Usando la estructura do .. while
        System.out.println("Utilizando la estructura do .. while:");
        i = N;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1); */

        /* Programa que pida que se introduzcan dos números enteros por teclado y muestre los números desde el menor hasta el mayor de los números introducidos. Los dos números introducidos deben ser distintos. Si son iguales se mostrará un mensaje indicándolo y se vuelven a introducir. (Punto 26)

        int numero1, numero2;

        System.out.print("Introduce el primer número entero: ");
        numero1 = sc.nextInt();

        do {
            System.out.print("Introduce el segundo número entero (distinto del primero): ");
            numero2 = sc.nextInt();

            if (numero1 == numero2) {
                System.out.println("Los números deben ser distintos. Intenta de nuevo.");
            }
        } while (numero1 == numero2);

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("Números desde el menor hasta el mayor:");
        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        } */

        /*  Programa que pida que se introduzcan dos números enteros A y B por teclado y muestre los números pares que hay entre A y B. A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir. (Punto 27)

        int A, B;

        System.out.print("Introduce el número entero A: ");
        A = scanner.nextInt();

        do {
            System.out.print("Introduce el número entero B (debe ser mayor que A): ");
            B = scanner.nextInt();

            if (A >= B) {
                System.out.println("A debe ser menor que B. Intenta de nuevo.");
            }
        } while (A >= B);

        System.out.println("Números pares entre " + A + " y " + B + ":");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        } */

        /* Programa que lea dos números enteros positivos N y M y muestre los múltiplos de N que hay desde 1 hasta M. Por ejemplo si N = 4 y M = 500 el programa mostrará los múltiplos de 4 desde 1 hasta 500. El valor de N deberá ser menor que el valor de M. Si no se introducen valores válidos para N o M se mostrará el mensaje correspondiente y se vuelven a pedir. (Punto 28)

        int N, M;

        do {
            System.out.print("Introduce un número entero positivo N: ");
            N = sc.nextInt();

            if (N <= 0) {
                System.out.println("N debe ser un número entero positivo. Intenta de nuevo.");
            }
        } while (N <= 0);

        do {
            System.out.print("Introduce un número entero positivo M (mayor que N): ");
            M = sc.nextInt();

            if (M <= N) {
                System.out.println("M debe ser mayor que N. Intenta de nuevo.");
            }
        } while (M <= N);

        System.out.println("Múltiplos de " + N + " desde 1 hasta " + M + ":");

        for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
                System.out.print(i + " ");
            }
        } */

        /* Programa Java que convierte millas a kilómetros. El programa pide que se introduzca una cantidad de millas y calcula y muestra su equivalente en Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para las millas. (Punto 29)

        1 Milla equivale a 1.6093 Kilómetros.

        El valor de los KM resultantes se debe mostrar con dos decimales.

        Para pasar de millas a Km realizaremos la operación:

        Km = millas * 1.6093


        final double FACTOR_CONVERSION = 1.6093;

        System.out.println("Este programa convierte millas a kilómetros.");
        System.out.println("Introduce una cantidad de millas (0 para salir):");

        while (true) {
            System.out.print("Millas: ");
            double millas = scanner.nextDouble();

            if (millas == 0) {
                System.out.println("¡Hasta luego!");
                break;
            }

            double kilometros = millas * FACTOR_CONVERSION;

            System.out.printf("%.2f millas equivale a %.2f kilómetros.\n", millas, kilometros);
        }

         */

    }
}
