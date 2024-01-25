// DeathbatO
import java.util.Scanner;

public class EsPalindromo {

    public static boolean esPalindromo(String cadena) {
        StringBuilder con = new StringBuilder();
        int len = cadena.split(" ").length;
        String sep[] = new String[len];
        sep = cadena.split(" ");
        for(int i = 0; i < len; i++){
            con.append(sep[i]);
        }
        cadena = con.toString().toLowerCase();
        return cadena.equals(new StringBuilder(cadena).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Por favor introdusca una cadena..: ");
        input = sc.nextLine();
        if(esPalindromo(input)){
            System.out.print("La cadena es un palindromo");
        }else{
            System.out.print("La cadena NO es un palindromo");
        }
        sc.close();
    }
}
