public class Ejercicio2 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double result = suma / array.length;
        System.out.println("La suma de los elementos del array es: " + result);
    }
}
