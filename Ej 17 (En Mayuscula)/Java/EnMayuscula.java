//DeathbatO
import java.util.Scanner;

public class EnMayuscula {

    public static String Mayus(String frase){
        StringBuilder fraseMayus = new StringBuilder();
        String pal[] = frase.split(" ");
        for(int i = 0; i < pal.length; i++){
            char car[] = pal[i].toCharArray();
            car[0] = Character.toUpperCase(car[0]);
            for(int j = 0; j < car.length; j++){
            	fraseMayus.append(car[j]);
            }
            fraseMayus.append(" ");
        }
        return fraseMayus.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print(" Por favor ingrese una frase: ");
        frase = sc.nextLine();
        System.out.println("La fraase con mayusculas corregidas: ");
        System.out.println(Mayus(frase));
        sc.close();
    }
}