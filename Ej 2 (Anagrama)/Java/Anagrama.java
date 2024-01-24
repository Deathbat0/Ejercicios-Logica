//DeathbatO

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static boolean esAnagrama(String a, String b){
        char[] arrayPalabra1 = a.toCharArray();
        char[] arrayPalabra2 = b.toCharArray();

        Arrays.sort(arrayPalabra1);
        Arrays.sort(arrayPalabra2);

        return Arrays.equals(arrayPalabra1, arrayPalabra2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;

        System.out.print("Ingrese la primera palabra: ");
        palabra1 = sc.nextLine().toLowerCase();
        System.out.print("Ingrese la segunda palabra: ");
        palabra2 = sc.nextLine().toLowerCase();sc.close();

        System.out.println(esAnagrama(palabra1, palabra2));
    } 
}
