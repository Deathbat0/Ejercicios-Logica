// DeathbatO

import java.util.Scanner;

public class Armstrong{
	
	public static boolean esNarcisista(int num){
		int mod, sum = 0, org;
		int len = String.valueOf(num).length();
		org = num;
		while(num != 0){
			mod = num % 10;
			sum += (int)(Math.pow(mod, len));
			num /= 10;
			}
		if(org == sum){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		for(int i = 0; i < 5; i++){
			System.out.print("Por favor digite un numero: ");
			num = sc.nextInt(); sc.nextLine();
			if(num > 0){
				if(esNarcisista(num)){
					System.out.println("El numero "+num+" es Narcisista..");
				}else{
					System.out.println("El numero "+num+" NO es Narcisista..");
				}
			}else{
				System.out.println("El numero debe ser mayor a cero...");
			}
		}
		sc.close();
	}
}
