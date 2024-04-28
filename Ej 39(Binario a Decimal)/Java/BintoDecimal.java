import java.util.Scanner;

//**
*   @author DeathatO
*/

public class BintoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int binario, residuo, pos,bin, aux;
		double numero;
		boolean esbinario;
		for(int i = 1; i<=10; i++ ){
			do {
			System.out.print("Ingrese el numero en binario ");
			binario = sc.nextInt();
			esbinario = true;
			aux = binario;
				while(aux != 0){
					residuo = aux % 10;
					if(residuo != 0 && residuo !=1){
						esbinario = false;
						System.out.println("El numero ingresado no es binario");
					}
					aux = aux/10;
				}
			} while(!esbinario);
			bin = binario;
			pos = 0;
			numero = 0;
			residuo = 0;
			while(binario!=0){
				residuo = binario % 10;
				numero =  numero + residuo*(int) Math.pow(2, pos);
				pos++;
				binario = binario/10;
			}
			System.out.println("El binario "+bin+" en decimal es "+numero);
		}
		System.out.print("...........Programa finalizado.............");
	}
}