package Intermedios.Eliminar_Valores_Arreglo;

import java.util.Scanner;

public class RemoveVals {

    public static void main(String[] args) {
        int[] arr = new int[15];
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        // Se llena el arreglo con números aleatorios del 1 al 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.floor(Math.random() * 100) + 1);
        }

        // Imprime el arreglo con los números generados aleatoriamente
        for (int val : arr) {
            System.out.print(String.format("[%s]", val));
        }
        System.out.println("");

        // Solicita al usuario un número
        System.out.println("Ingresa un número:");
        int num = scanner.nextInt();

        while (index < arr.length) {
            if (arr[index] == num) {
                for (int i = index; i < arr.length; i++) {
                    if (i+1 < arr.length) {
                        arr[i] = arr[i+1];
                    } else {
                        arr[i] = 0;
                    }
                }
            } else {
                index++;
            }
        }

        // Imprime el arreglo despues de elimnar los valores en el arreglo
        for (int val : arr) {
            System.out.print(String.format("[%s]", val));
        }
    }

}
