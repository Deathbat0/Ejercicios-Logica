//DeathbatO

import java.util.Scanner;

public class CountWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena, word;
        String charsNoValid = ".,_?!'";
        int count = 0;
        
        System.out.print("Por favor ingrese el texto inicial: ");
        cadena = sc.nextLine().toUpperCase();
        String[] palabras = cadena.split(" ");
        for(int i = 0; i < palabras.length; i++){
        	for(char c : charsNoValid.toCharArray()){
        		palabras[i] = palabras[i].replace(String.valueOf(c), "");
        	}
        }
        System.out.print("Ingrese la palabra que desea buscar: ");
        word = sc.nextLine().toUpperCase();
        for(int i = 0; i < palabras.length; i++){
        	if(palabras[i].equals(word)){
        		count++;
        	}
        }
        System.out.print("La palabra "+word+" se repite "+count+" veces en el texto.");
        sc.close();
    }
}
