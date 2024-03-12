/**
 * @author DeathbatO
 */
public class Marcos {

    public static void mostrarMarcoRectangular(String texto) {
        // Dividir el texto en palabras
        String[] palabras = texto.split("\\s+");

        // Encontrar la longitud de la palabra más larga
        int longitudMaxima = 0;
        for (String palabra : palabras) {
            if (palabra.length() > longitudMaxima) {
                longitudMaxima = palabra.length();
            }
        }

        // Imprimir el marco superior
        System.out.println("*".repeat(longitudMaxima + 4));

        // Imprimir las palabras con el marco lateral
        for (String palabra : palabras) {
            System.out.printf("* %-" + longitudMaxima + "s *\n", palabra);
        }

        // Imprimir el marco inferior
        System.out.println("*".repeat(longitudMaxima + 4));
    }

    public static void main(String[] args) {
        String textoEjemplo = "Esta es una frase de ejemplo para probar la función.";
        mostrarMarcoRectangular(textoEjemplo);
    }
}
