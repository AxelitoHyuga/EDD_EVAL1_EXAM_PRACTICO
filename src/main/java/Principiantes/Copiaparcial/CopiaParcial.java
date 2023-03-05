package Principiantes.Copiaparcial;

import java.util.Scanner;

public class CopiaParcial {
    public static void main(String[] args) {
        int[] arreglo = new int[15];
        int[] copia;
        int contadorPares = 0;
        Scanner scanner = new Scanner(System.in);

        // Llenar el arreglo con valores aleatorios entre 1 y 20
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 20) + 1;
        }

        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // Pedir al usuario que ingrese las posiciones inicial y final del rango a copiar
        System.out.print("Ingrese la posición inicial del rango a copiar: ");
        int posicionInicial = scanner.nextInt();
        System.out.print("Ingrese la posición final del rango a copiar: ");
        int posicionFinal = scanner.nextInt();

        // Contar cuántos valores pares hay en el rango
        for (int i = posicionInicial; i <= posicionFinal; i++) {
            if (arreglo[i] % 2 == 0) {
                contadorPares++;
            }
        }

        // Crear un nuevo arreglo de tamaño igual al contador de valores pares
        copia = new int[contadorPares];

        // Agregar los valores pares al nuevo arreglo
        int j = 0;
        for (int i = posicionInicial; i <= posicionFinal; i++) {
            if (arreglo[i] % 2 == 0) {
                copia[j] = arreglo[i];
                j++;
            }
        }

        // Imprimir la copia de los datos pares en el rango especificado
        System.out.println("Copia de los datos pares en el rango " + posicionInicial + " a " + posicionFinal + ":");
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + " ");
        }
        System.out.println();
    }
}
