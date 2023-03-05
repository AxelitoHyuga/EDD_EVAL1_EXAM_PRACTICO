package Intermedios.Insertar_Valores_Arreglo;

import java.util.Scanner;

public class ArrayVals {

    public static void main(String[] args) {
        int[] arr = new int[15];
        int index = arr.length - 1;
        Scanner scanner = new Scanner(System.in);

        // Bucle infinito para escuchar los input del usuario.
        // Dependiendo del valor del input ingresado se ejecutara una acción
        while (true) {
            System.out.println("Ingresa «insert» si deseas insertar un número.");
            System.out.println("Ingresa «exit» si deseas salir.");
            String input = scanner.nextLine();

            if (!input.isEmpty() && input.equals("insert")) { // Si el input val es «insert» se inserta el valor en la posición anterior del arreglo
                if (index > 0) {
                    System.out.println("Ingresa el número:");
                    int val = scanner.nextInt();
                    int ci = arr.length -1 ;

                    while (ci >= index) {
                        if (val <= arr[ci]) {
                            ci--;
                        } else {
                            break;
                        }
                    }

                    if (ci >= index) {
                        for (int i = 0; i < ci; i++) {
                            arr[i] = arr[i+1];
                        }
                        arr[ci] = val;
                        index--;
                    } else {
                        arr[index--] = val;
                    }

                    for (int num : arr) {
                        System.out.print(String.format("[%s]", num));
                    }

                } else {
                    System.out.println("Todas las posiciones del arreglo han sido llenadas");
                    break;
                }

            } else if (!input.isEmpty() && input.equals("exit")) { // Si el input val es «exit» termina el bucle
                break;
            }
        }

        scanner.close();
    }

}
