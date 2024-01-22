// DeathbatO

import java.util.Scanner;

public class Dectobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int numero, exp, dig, num;
		double binario;
		for(int i = 0; i<= 9; i++) {
			System.out.print("Digite el numero a convertir: ");
			numero = sc.nextInt();
			num = numero; exp = 0; binario = 0;
			while(numero != 0) {
				dig = numero % 2;
				binario = binario + dig * Math.pow(10,exp);
				exp++;
				numero = numero/2;
			}
			System.out.println("El numero "+num+" en binario es: "+binario);
		}
        sc.close();
		System.out.print("Programa finalizado");
    }
}
