public class Ejercicio5 {
    public static void main(String[] args) {
        int[] array = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int range = max - min;
        System.out.println("El rango del array es: " + range);
    }
}