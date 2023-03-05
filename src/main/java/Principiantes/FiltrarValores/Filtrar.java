package Principiantes.FiltrarValores;

import java.util.Random;

public class Filtrar {
    public static void main(String[] args) {
        int[] arreglo = new int[15];
        Random rand = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            int num = rand.nextInt(50) * 2 + 2; // Genera un nmero aleatoreo par entre 1 y 100
            boolean exists = false;
            for (int j = 0; j < i; j++) {
                if (arreglo[j] == num) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                arreglo[i] = num;
            } else {
                i--;
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }
}
