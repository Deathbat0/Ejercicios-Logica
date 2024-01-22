//DeathbatO

import java.util.Scanner;

public class AreaPoligono {
    
    public static Scanner sc = new Scanner(System.in);

    public static double areaPoligono(char pol){
        switch (pol) {
            case 'T':
                double area, base, alrura;
                System.out.print("Base del Triangulo: ");
                base = sc.nextDouble();
                System.out.print("\nAltura del triangulo: ");
                alrura = sc.nextDouble();
                area = (base*alrura)/2;
                return area;
            case 'C':
                double largo;
                System.out.print("Ingres el largo de un lado: ");
                largo = sc.nextDouble();
                area = Math.pow(largo, 2);
                return area;
            case 'R':
                double ancho;
                System.out.print("Ingrese el largo: ");
                largo = sc.nextDouble();
                System.out.print("Ingres eel ancho: ");
                ancho = sc.nextDouble();
                area = ancho*largo;
                return area;
            
            default:
                System.out.println("Esa no es una opcion");
                break;
            }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char pol;
        System.out.println("Vamos a calcular el area de un poligono...");
        System.out.println("Por favor indique de que poligono quiere que se haga el calculo.");
        System.out.print("T para triangulo\nC para cuadrado\nR para rectangulo\nOpcion: ");
        pol = sc.nextLine().toUpperCase().charAt(0);
        System.out.println("El area del poligono es: "+areaPoligono(pol)+" unidades cuadradas"); 
        sc.close();
    }
}
