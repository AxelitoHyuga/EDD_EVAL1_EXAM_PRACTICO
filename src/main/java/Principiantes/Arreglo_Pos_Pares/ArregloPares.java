package Principiantes.Arreglo_Pos_Pares;

public class ArregloPares {

    public static void main(String[] args) {
        int[] original = new int[15];
        int[] copia = new int[15];

        // Se llena el arreglo original con valores aleatorios
        for (int i = 0; i < original.length; i++) {
            original[i] = (int) (Math.random() * 100) + 1;
            if (i % 2 == 0) {
                // En las posiciones pares solo deben almacenarse valores pares
                while (original[i] % 2 != 0) {
                    original[i] = (int) (Math.random() * 100) + 1;
                }
            }
        }

        // Se copea el arreglo original al arreglo copia
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        // Imprimir ambos arreglos
        System.out.println("Arreglo original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print("[" + original[i] + "]");
        }
        System.out.println("");
        System.out.println("Arreglo copia: ");
        for (int i = 0; i < copia.length; i++) {
            System.out.print("[" + copia[i] + "]");
        }
    }

}
