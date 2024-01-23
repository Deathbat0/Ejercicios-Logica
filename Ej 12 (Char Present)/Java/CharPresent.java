//DeathbatO

import java.util.Scanner;

public class CharPresent{

    public static Scanner sc = new Scanner(System.in);

    public static String CharP(String in1, String in2){
        StringBuilder out1 = new StringBuilder();
        for(char c : in1.toCharArray()){
        	if(!in2.contains(String.valueOf(c))){
        		out1.append(c);
        	}
        }
        return out1.toString();
    }

    public static void main(String[] args) {
        String entrada1, entrada2, out1, out2;
        System.out.print("Por favor ingrese la primera cadena: ");
        entrada1 = sc.nextLine();
        System.out.print("Por favor ingrese la segunda cadena: ");
        entrada2 = sc.nextLine();
        
        out1 = CharP(entrada1, entrada2);
        out2 = CharP(entrada2, entrada1);

        System.out.println("out1: " + out1);
        System.out.println("out2: " + out2);

    }
}