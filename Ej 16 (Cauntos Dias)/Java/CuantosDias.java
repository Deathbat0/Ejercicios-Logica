//DeathbatO

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CuantosDias{

    public static int calcularDiferenciaEnDias(String fecha1, String fecha2){
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date f1 = dateFormat.parse(fecha1);
            Date f2 = dateFormat.parse(fecha2);

            long diferenciaEnMillis = Math.abs(f1.getTime() - f2.getTime());
            long diferenciaEnDias = diferenciaEnMillis / (24 * 60 * 60 * 1000);

            return (int) diferenciaEnDias;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Una o ambas fechas no son válidas", e);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite una fecha en formato dd/MM/yyyy: ");
        String fecha1 = sc.next();

        System.out.print("Digite una fecha en formato dd/MM/yyyy: ");
        String fecha2 = sc.next();

        int diferencia = calcularDiferenciaEnDias(fecha1, fecha2);
        System.out.println("La diferencia en días entre " + fecha1 + " y " + fecha2 + " es: " + diferencia + " días.");
        sc.close();
    }
}