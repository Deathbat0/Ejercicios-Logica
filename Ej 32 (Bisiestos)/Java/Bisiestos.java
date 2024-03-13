/**
 * @author DeathbatO
 */
import java.util.Scanner;
public class Bisiestos{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int year, count = 0;
        System.out.print("Introduce un año: ");  year = sc.nextInt();
        sc.close(); System.out.println("Los proximos 30 años bisiestos son: ");
        while(count < 30){
            year++;
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year);
            }
        }
    }
}