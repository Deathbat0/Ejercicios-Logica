//DeathbatO

import java.util.Scanner;

public class Anagrama {

    public static boolean esAnagrama(String a, String b){
        if(a.equals(b) || a.length() != b.length()){
            return false;
        }else{
            int count = 0 ;
            for(int i = 0;  i < a.length(); i++){
                for(int j = 0; j < b.length(); j++){
                    if(a.charAt(i) == b.charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            if(count >= a.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;

        System.out.print("Ingrese la primera palabra: ");
        palabra1 = sc.nextLine().toLowerCase();
        System.out.print("Ingrese la segunda palabra: ");
        palabra2 = sc.nextLine().toLowerCase();sc.close();

        System.out.println(esAnagrama(palabra1, palabra2));
    } 
}
