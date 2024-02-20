//DeathbatO

import java.util.HashMap;

public class PiedraPapelTijera {
    public static String calcularGanador(String[][] jugadas) {
        HashMap<String, Integer> puntajes = new HashMap<>();
        puntajes.put("Player 1", 0);
        puntajes.put("Player 2", 0);
        
        HashMap<String, String> reglas = new HashMap<>();
        reglas.put("RS", "Player 1");
        reglas.put("SP", "Player 1");
        reglas.put("PR", "Player 1");
        reglas.put("SR", "Player 2");
        reglas.put("PS", "Player 2");
        reglas.put("RP", "Player 2");

        for (String[] jugada : jugadas) {
            if (jugada[0].equals(jugada[1])) {
                continue; // Empate
            }
            String ganador = reglas.get(jugada[0] + jugada[1]);
            puntajes.put(ganador, puntajes.get(ganador) + 1);
        }

        int puntajePlayer1 = puntajes.get("Player 1");
        int puntajePlayer2 = puntajes.get("Player 2");

        if (puntajePlayer1 > puntajePlayer2) {
            return "Player 1";
        } else if (puntajePlayer2 > puntajePlayer1) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }

    public static void main(String[] args) {
        String[][] juego1 = {{"R", "S"}, {"S", "R"}, {"P", "S"}};
        String[][] juego2 = {{"R", "R"}, {"S", "P"}, {"R", "P"}};
        String res1 = calcularGanador(juego1);
        String res2 = calcularGanador(juego2);
        System.out.println("El ganador es: " + res1);
        System.out.println("El ganador es: "+ res2);
    }
}