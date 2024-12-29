public class Ejercicio6 {

    public static void main(String[] args) {
        int[] array = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double sum = 0.0;
        double mean;
        double standardDeviation = 0.0;

        for (int num : array) {
            sum += num;
        }

        mean = sum / array.length;

        for (int num : array) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        standardDeviation = Math.sqrt(standardDeviation / array.length);

        System.out.println("La desviacion estandar del array es: " + standardDeviation);
    }
}
