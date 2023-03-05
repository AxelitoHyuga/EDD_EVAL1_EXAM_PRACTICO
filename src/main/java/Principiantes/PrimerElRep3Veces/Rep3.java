package Principiantes.PrimerElRep3Veces;

import java.util.Random;

public class Rep3 {
    public static void main(String[] args) {
        // Generar un arreglo de tamaño 20 con valores aleatorios entre 1 y 20
        int[] arreglo = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(20) + 1;
        }

        // Imprimir el arreglo
        System.out.println("Arreglo: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }

        // Buscar el primer valor triplicado en el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            int count = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("El primer valor triplicado es: " + arreglo[i]);
                return;
            }
        }

        // Si no se encuentra ningún valor triplicado, imprimir un mensaje
        System.out.println("No se encontró ningún valor triplicado.");
    }
}
