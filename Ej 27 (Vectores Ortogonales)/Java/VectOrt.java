/**
 * @author DeathbatO
 */

 import java.util.Scanner;

 public class VectOrt{
     
     // Función para determinar si dos vectores son ortogonales
     public static boolean sonOrtogonales(int[] vector1, int[] vector2) {
         if (vector1.length != vector2.length) {
             return false;
         }
 
         int productoPunto = 0;
         for (int i = 0; i < vector1.length; i++) {
             productoPunto += vector1[i] * vector2[i];
         }
 
         return productoPunto == 0;
     }
     
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Ingrese la longitud de los vectores: ");
         int longitud = sc.nextInt();
 
         int[] vector1 = new int[longitud];
         int[] vector2 = new int[longitud];
 
         // Ingreso de elementos para el primer vector
         System.out.println("Ingrese los elementos del primer vector:");
         for (int i = 0; i < longitud; i++) {
             System.out.print("Elemento " + (i + 1) + ": ");
             vector1[i] = sc.nextInt();
         }
 
         // Ingreso de elementos para el segundo vector
         System.out.println("Ingrese los elementos del segundo vector:");
         for (int i = 0; i < longitud; i++) {
             System.out.print("Elemento " + (i + 1) + ": ");
             vector2[i] = sc.nextInt();
         }
 
         // Verificando si los vectores son ortogonales
         if (sonOrtogonales(vector1, vector2)) {
             System.out.println("Los vectores son ortogonales.");
         } else {
             System.out.println("Los vectores no son ortogonales.");
         }
         sc.close();
         
     }
     
 }
 