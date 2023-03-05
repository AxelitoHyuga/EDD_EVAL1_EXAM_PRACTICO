package Intermedios.Conteo;

public class Conteo {

    public static void main(String[] args) {
        int[] arr = new int[15];
        int filas = arr.length;

        // Se llena el arreglo con números aleatorios del 1 al 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.floor(Math.random() * 100) + 1);
        }

        // Creamos una compia del arreglo para definir las filas y los duplicados
        int[] arrCopy = arr;

        // Imprime el arreglo con los números generados aleatoriamente
        for (int val : arr) {
            System.out.print(String.format("[%s]", val));
        }
        System.out.println("");

        // Genera un arreglo de mismo tamaño donde solo se guardaran los valores unicos, sin sus los duplicados (Si es que tienen)
        int[] valUnicos = new int[arr.length];
        int uniCount = 0;
        boolean isUnique;

        // Genera un bucle que inicia en 0 y llega hasta la longuitud del arreglo original
        // Guarda el valor actual en en arreglo «valUnicos»
        // Si encuentra que el valor actual ya existe en «valUnicos» ya no agrega este duplicado
        for (int i = 0; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < uniCount; j++) {
                if (arr[i] == valUnicos[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                valUnicos[uniCount] = arr[i];
                uniCount++;
            }
        }

        // Genera una matriz con un número de filas igual a «uniCount»
        // Genera un bucle que inicia en cero y termina en «uniCount» recorriendo así los valores unicos
        int[][] matriz = new int[uniCount][2];
        for (int i = 0; i < uniCount; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) { // Busca los duplicados de cada valor unico. Si existen duplicados aumenta la variable «count»
                if (valUnicos[i] == arr[j]) {
                    count++;
                }
            }

            // Asigna los valores de la matriz
            // [Valor unico del Arreglo][Cantidad de veces que se repite]
            matriz[i][0] = valUnicos[i];
            matriz[i][1] = count;
        }

        // Imprime la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                System.out.print(String.format("[%s]", matriz[i][j]));
            }
            System.out.println("");
        }
    }

}
