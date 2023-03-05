package Principiantes.CompararArreglos;

import java.util.Arrays;
import java.util.Scanner;

public class CompararArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];

        // Solicitar valores para llenar el primer arreglo
        System.out.println("Ingresa valores para el primer arreglo:");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arreglo1[i] = sc.nextInt();
        }

        // Solicitar valores para llenar el segundo arreglo
        System.out.println("Ingresa valores para el segundo arreglo:");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arreglo2[i] = sc.nextInt();
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

        // Comparar si los arreglos son iguales
        boolean iguales = true;
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] != arreglo2[i]) {
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Los arreglos son iguales");
        } else {
            System.out.println("Los arreglos son diferentes");
        }
    }
}
