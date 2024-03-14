import java.util.Arrays;

public class Segundo {
    public static void main(String[] args) {
        int[] lista = {2, 4, 8, 6, 9, 0, 7, 6};
        Arrays.sort(lista); // Ordena la lista de forma ascendente

        System.out.println("El SEGUNDO numero mas grande de la lista " + Arrays.toString(lista) + " es: ");
        System.out.println(lista[lista.length - 2]); // Imprime el segundo número más grande
    }
}