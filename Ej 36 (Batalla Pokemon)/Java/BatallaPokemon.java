import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//*
* @author DeathbatO
*/

public class BatallaPokemon{

    // Método para calcular la efectividad del ataque
    public static float calcularEfectividad(String tipoAtacante, String tipoDefensor) {
        // Tabla de efectividad
        // El primer índice corresponde al tipo del atacante y el segundo al tipo del defensor
        Map<String, Map<String, Float>> efectividad = new HashMap<>();
        efectividad.put("Agua", new HashMap<String, Float>() {{
            put("Agua", 1f);
            put("Fuego", 0.5f);
            put("Planta", 2f);
            put("Eléctrico", 1f);
        }});
        efectividad.put("Fuego", new HashMap<String, Float>() {{
            put("Agua", 2f);
            put("Fuego", 1f);
            put("Planta", 0.5f);
            put("Eléctrico", 1f);
        }});
        efectividad.put("Planta", new HashMap<String, Float>() {{
            put("Agua", 0.5f);
            put("Fuego", 2f);
            put("Planta", 1f);
            put("Eléctrico", 1f);
        }});
        efectividad.put("Eléctrico", new HashMap<String, Float>() {{
            put("Agua", 1f);
            put("Fuego", 1f);
            put("Planta", 1f);
            put("Eléctrico", 1f);
        }});

        return efectividad.get(tipoAtacante).get(tipoDefensor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo del Pokémon atacante: ");
        String tipoAtacante = scanner.nextLine();
        System.out.print("Tipo del Pokémon defensor: ");
        String tipoDefensor = scanner.nextLine();
        System.out.print("Ataque (entre 1 y 100): ");
        int ataque = scanner.nextInt();
        System.out.print("Defensa (entre 1 y 100): ");
        int defensa = scanner.nextInt();

        // Validar que los valores de ataque y defensa estén dentro del rango permitido
        if (ataque < 1 || ataque > 100 || defensa < 1 || defensa > 100) {
            System.out.println("Error: El valor de ataque y defensa debe estar entre 1 y 100.");
            return;
        }

        // Calcular la efectividad del ataque
        float efectividad = calcularEfectividad(tipoAtacante, tipoDefensor);

        // Calcular el daño del ataque
        float danio = 50 * (ataque / (float)defensa) * efectividad;

        // Imprimir el resultado
        System.out.printf("El daño del ataque es: %.2f\n", danio);
    }
}
