public class Ejercicio3 {
    public static void main(String[] args) {
        int[] array = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("El valor máximo del array es: " + max);
    }
}
