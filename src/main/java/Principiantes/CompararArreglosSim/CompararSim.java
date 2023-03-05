package Principiantes.CompararArreglosSim;

import java.util.Arrays;
import java.util.Scanner;

public class CompararSim {
    public static void main(String[] args) {
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Capturar valores para el primer arreglo
        System.out.println("Ingresa los valores para el primer arreglo:");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        // Capturar valores para el segundo arreglo
        System.out.println("Ingresa los valores para el segundo arreglo:");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        // Imprimir ambos arreglos
        System.out.println("Primer arreglo: ");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("[" + arreglo1[i] + "]");
        }
        System.out.println("Segundo arreglo: ");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("[" + arreglo2[i] + "]");
        }

        // Comparar si los arreglos son similares
        boolean sim = true;
        for (int i = 0; i < arreglo1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i] == arreglo2[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                sim = false;
                break;
            }
        }

        // Imprimir si los arreglos son similares o no
        if (sim) {
            System.out.println("Los arreglos son similares.");
        } else {
            System.out.println("Los arreglos NO son similares.");
        }
    }
}
