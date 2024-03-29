// DeathbatO

import java.util.Scanner;

public class FactRec {
	
	public static int Factorial(int n){
		if(n == 0){
            return 1;
        }else{
            return n * Factorial(n-1);
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		for(int i = 0; i < 5; i++){
			System.out.print("Ingrese un numero para calcular su factorial: ");
			num = sc.nextInt(); sc.nextLine();
			if(num > 0){
				System.out.println("El factorial de "+num+" es: "+Factorial(num));
			}else if(num == 0){
				System.out.println("El factorial de 0 es: 1");
			}else{
				System.out.println("ERROR: Numero negativo");
			}
		}
        sc.close();
	}
}
