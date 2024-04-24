import java.util.HashMap;
import java.util.Map;

public class Anillos{

    // Definir las fuerzas de cada raza
    private static final Map<String, Integer> fuerzas = new HashMap<>();
    static {
        fuerzas.put("Pelosos", 1);
        fuerzas.put("Sureños buenos", 2);
        fuerzas.put("Enanos", 3);
        fuerzas.put("Númenóreanos", 4);
        fuerzas.put("Elfos", 5);
        fuerzas.put("Sureños malos", 2);
        fuerzas.put("Orcos", 2);
        fuerzas.put("Goblins", 2);
        fuerzas.put("Huargos", 3);
        fuerzas.put("Trolls", 5);
    }

    // Función para calcular el resultado de la batalla
    public static String resultadoBatalla(String[] ejercitoBien, String[] ejercitoMal) {
        int fuerzaTotalBien = calcularFuerzaTotal(ejercitoBien);
        int fuerzaTotalMal = calcularFuerzaTotal(ejercitoMal);

        int integrantesBien = ejercitoBien.length;
        int integrantesMal = ejercitoMal.length;

        if (fuerzaTotalBien * integrantesBien > fuerzaTotalMal * integrantesMal) {
            return "El bien triunfa en la batalla!";
        } else if (fuerzaTotalBien * integrantesBien < fuerzaTotalMal * integrantesMal) {
            return "El mal prevalece en la batalla!";
        } else {
            return "¡Es un empate!";
        }
    }

    // Función auxiliar para calcular la fuerza total de un ejército
    private static int calcularFuerzaTotal(String[] ejercito) {
        int fuerzaTotal = 0;
        for (String raza : ejercito) {
            fuerzaTotal += fuerzas.get(raza);
        }
        return fuerzaTotal;
    }

    // Método main para probar el programa
    public static void main(String[] args) {
        String[] ejercitoBien = {"Elfos", "Númenóreanos", "Pelosos"};
        String[] ejercitoMal = {"Trolls", "Orcos", "Goblins"};

        System.out.println(resultadoBatalla(ejercitoBien, ejercitoMal));
    }
}
