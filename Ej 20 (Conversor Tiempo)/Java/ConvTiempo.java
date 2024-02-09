//DeathbatO

import java.util.Scanner;

public class ConvTiempo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de tiempo a milisegundos>>  \n");
        System.out.print("Digite el numero de dias: ");
        int dias = sc.nextInt();
        System.out.print("Digite el numero de horas: ");
        int horas = sc.nextInt();
        System.out.print("Digite el numero de minutos: ");
        int min = sc.nextInt();
        System.out.print("Digite el numero de segundos: ");
        int seg = sc.nextInt();

        System.out.println("\nEl resultado en milisegundos es " + convTiempo(dias, horas, min, seg));
        sc.close();
    }

    public static long convTiempo(int dias, int horas, int min, int seg) {
        long mils = (seg * 1000) + (min * 60000) + (horas * 3600000) + (dias * 3600000 * 24);
        return mils;
    }
}