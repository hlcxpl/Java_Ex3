import java.util.Random;
import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10);
        System.out.println("el tamaño de la lista  es " + numero);
        int[] lista = new int[numero];
        for (int i = 0; i < numero; i++) {
            lista[i] = aleatorio.nextInt(10);
            System.out.println("el elemento " + i + " es " + lista[i]);
        }

        System.out.println("el contenido del array es " + Arrays.toString(lista));
    }
}
