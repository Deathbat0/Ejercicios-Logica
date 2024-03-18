import java.util.Scanner;

public class CicloChino {
    
    public static void cicloSexagenario(int año) {
        // Array para almacenar los elementos y animales
        String[] elementos = {"Madera", "Fuego", "Tierra", "Metal", "Agua"};
        String[] animales = {"Rata", "Buey", "Tigre", "Conejo", "Dragón",
                            "Serpiente", "Caballo", "Oveja", "Mono", "Gallo",
                            "Perro", "Cerdo"};

        // Cálculo del año dentro del ciclo sexagenario
        int ciclo = (año - 1984) % 60;
        if (ciclo < 0) ciclo += 60;

        // Obtención del elemento y animal correspondiente
        int indiceElemento = (ciclo / 2) % 5;
        int indiceAnimal = ciclo % 12;

        // Impresión del resultado
        System.out.println("Elemento: " + elementos[indiceElemento]);
        System.out.println("Animal: " + animales[indiceAnimal]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int año = scanner.nextInt();
        scanner.close();

        cicloSexagenario(año);
    }
}