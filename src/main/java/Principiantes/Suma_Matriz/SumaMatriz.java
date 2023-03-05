package Principiantes.Suma_Matriz;

import java.util.Scanner;

public class SumaMatriz {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        // Se llena la matriz con valores capturados
        System.out.println("Ingrese los valores para la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Verificar si la suma de los valores en cada fila es igual a la suma de los valores en la columna correspondiente
        if (verificarSuma(matriz, matriz.length)) {
            System.out.println("La suma de los valores en cada fila es igual a la suma de los valores en la columna correspondiente");
        } else {
            System.out.println("La suma de los valores en cada fila NO es igual a la suma de los valores en la columna correspondiente");
        }
    }

    public static boolean verificarSuma(int[][] matriz, int n) {
        int[] sumaFila = new int[n];
        int[] sumaColumna = new int[n];

        // Se calcula la suma de los valores en cada fila y en cada columna
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumaFila[i] += matriz[i][j];
                sumaColumna[j] += matriz[i][j];
            }
        }

        // Verificar si la suma de los valores en cada fila es igual a la suma de los valores en la columna correspondiente
        for (int i = 0; i < n; i++) {
            if (sumaFila[i] != sumaColumna[i]) {
                return false;
            }
        }

        return true;
    }

}
