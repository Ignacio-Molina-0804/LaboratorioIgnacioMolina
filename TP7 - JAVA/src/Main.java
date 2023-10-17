import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Ejercicio 1

        int[] arr = {5, 2, 9, 1, 5, 6};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado de mayor a menor");
        System.out.println("-----------------");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }*/

    /* Ejercicio 2

    int[] arr = {5, 2, 9, 1, 5, 6};
    int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
        System.out.println("Array ordenado de menor a mayor");
        System.out.println("-----------------");

        for (int num : arr) {
        System.out.print(num + " ");
    }

    */

        /* Ejercicio 3

        double[] arr = {5.2, 2.5, 9.9, 2.3, 5.1, 6};
        double n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {

                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado de mayor a menor");
        System.out.println("-----------------");

        for (double num : arr) {
            System.out.print(num + " ");
        } */

        /* Ejercicio 4

        double[] arr = {5.2, 2.5, 9.9, 2.3, 5.1, 6};
        double n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado de menor a mayor");
        System.out.println("-----------------");

        for (double num : arr) {
            System.out.print(num + " ");
        } */

        /* Ejercicio 5

        String[] array = {"Pepe", "Juan", "Pedro", "Ignacio", "Derek"};

        Arrays.sort(array);

        for (String s : array) {
            System.out.print(s + " ");
        } */

        /* Ejercicio 6

        String[] array = {"Pepe", "Juan", "Pedro", "Ignacio", "Derek"};

        for (int i = array.length - 1; i >= 0; i--) {
            String arrayInverso = array[i];
            System.out.print(" " + arrayInverso);
        } */

        /* Ejercicio 7

        int[] arr = {9,5,8,754,94,654,98,3528,54,1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        } */

        /* Ejercicio 8

        int i, j, menor, pos, tmp;
        int[] A = {9,5,8,754,94,654,98,3528,54,1};

        for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
            menor = A[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j] < menor) {           // del array algún elemento
                    menor = A[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }

        for (int num : A) {
            System.out.print(num + " ");
        } */


        /* Ejercicio 9

        int[] A = {9,5,8,754,94,654,98,3528,54,1};
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux < A[j])){

                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }

        for (int num : A) {
            System.out.print(num + " ");
        } */

        /* Ejercicio 10

        int[] A = {9,5,8,754,94,654,98,3528,54,1};
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++){
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }

        for (int num : A) {
            System.out.print(num + " ");
        } */

        /* Ejercicio 11

        int[] A = {9,5,8,754,94,654,98,3528,54,1};
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
            aux = A[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el
                // valor de aux sea menor que los
                A[j + 1] = A[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            A[j + 1] = aux;       // colocamos aux en su sitio
        }

        for (int num : A) {
            System.out.print(num + " ");
        } */

        /* Ejercicio 11

        int[] A = {9,5,8,754,94,654,98,3528,54,1};
        int izq = 0;
        int der = A.length-1;

        quicksort(A, 0, A.length - 1);

        public static void quicksort(int A[], int izq, int der) {

            int pivote=A[izq]; // tomamos primer elemento como pivote
            int i=izq;         // i realiza la búsqueda de izquierda a derecha
            int j=der;         // j realiza la búsqueda de derecha a izquierda
            int aux;

            while(i < j){                          // mientras no se crucen las búsquedas
                while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
                while(A[j] > pivote) j--;           // busca elemento menor que pivote
                if (i < j) {                        // si no se han cruzado
                    aux= A[i];                      // los intercambia
                    A[i]=A[j];
                    A[j]=aux;
                }
            }

            A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
            A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

            if(izq < j-1)
                quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
            if(j+1 < der)
                quicksort(A,j+1,der);          // ordenamos subarray derecho

        }

        for (int num : A) {
            System.out.print(num + " ");
        }

        */

        /* Ejercicio 12

        int[] A = {9,5,8,754,94,654,98,3528,54,1};

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.
                    }
                }
            }
        }

        for (int num : A) {
            System.out.print(num + " ");
        }

         */

        /* Ejercicio 13

        int longitud = 20;
        int[] A  = new int[longitud];
        int n = A.length;

        System.out.println("Array Desordenado: ");

        for (int num : A) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < longitud; i++) {

            System.out.println("Ingresar el valor de la posición nro " + i + " del array: ");
            A[i] = scanner.nextInt();

        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j] > A[j + 1]) {

                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        System.out.println("-----------------");
        System.out.println("Array Ordenado: ");

        for (int num : A) {
            System.out.print(num + " ");
        } */

    }
}
