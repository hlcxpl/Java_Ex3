public class Ejercicio8 {
    public static void main(String[] args) {
        int[] array = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[][] differenceMatrix = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                differenceMatrix[i][j] = array[i] - array[j];
            }
        }

        System.out.println("La matriz de diferencias es:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(differenceMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}