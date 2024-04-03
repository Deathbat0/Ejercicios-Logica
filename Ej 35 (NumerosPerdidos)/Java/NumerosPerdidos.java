import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author DeathabtO
 */
public class NumerosPerdidos{

    public static List<Integer> findMissingNumbers(int[] arr) throws IllegalArgumentException {
        // Verificar si el array es válido
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("El array de entrada no es válido");
        }

        // Verificar si el array está ordenado y no tiene elementos repetidos
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                throw new IllegalArgumentException("El array de entrada no está ordenado o tiene elementos repetidos");
            }
        }

        int min = arr[0];
        int max = arr[arr.length - 1];
        List<Integer> missingNumbers = new ArrayList<>();

        // Calcular los números faltantes entre el mayor y el menor
        for (int i = min + 1; i < max; i++) {
            if (!contains(arr, i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    private static boolean contains(int[] arr, int target) {
        return Arrays.binarySearch(arr, target) >= 0;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 5, 7, 10};

        try {
            List<Integer> missing = findMissingNumbers(sortedArray);
            System.out.println("Números faltantes: " + missing);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}