// DeathbatO
import java.util.Scanner;

public class Dibujo {

    public static void DrawSquare(int size){
        for(int i = 1; i <= size; i++){
        	for(int j = 1; j <= size; j++){
        		 System.out.print("*"+" ");
        	}
        	System.out.println("");
        }
    }

    public static void DrawTriangle(int n){
    	for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        String entr;
        char fig;
        System.out.println("----Vamos a dibujar-----");
        System.out.println("Por favor ingrese la figura que quiere dibujar");
        System.out.println("[C] Para cuadrado o [T] para triangulo.");
        System.out.print(" >>> "); entr = sc.nextLine();
        fig = entr.toUpperCase().toCharArray()[0];
        switch (fig) {
            case 'C':
                System.out.println("Vamos a dibujar un Cuadrado");
                System.out.print("Dijita por favor el tamaño: ");
                size = sc.nextInt();
                DrawSquare(size);
                break;
            case 'T':
                System.out.println("Vamos a dibujar un Triangulo");
                System.out.print("Dijita por favor el tamaño: ");
                size = sc.nextInt();
                DrawTriangle(size);
                break;
            default:
                System.out.println("ERROR: La letra que digitaste no esta en las opciones.");
                break;
        }
        sc.close();
    }
}