//DeathbatO

import java.util.Scanner;

public class InvCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.print("Por favor ingrese la cadena a invertir: ");
        input = sc.nextLine();
        char cadena[] = new char[input.length()];
        cadena = input.toCharArray();
        System.out.println("Cadena invertida: ");
        for(int i = input.length()-1; i >= 0; i--){
            System.out.print(cadena[i]);
        }   
        sc.close();
    }
}