//DeathbatO
import java.util.Scanner;
import java.util.Stack;

public class ExpEq {

    public static Scanner sc = new Scanner(System.in);
    
    private static boolean apertura(char c){
    	return c == '{' || c == '[' || c == '(';
    }
    
    private static boolean cierra(char c){
    	return c == '}' || c == ']' || c == ')';
    }
    
    private static boolean parValido(char a, char c){
    	return (a == '{' && c == '}') || 
    			(a == '[' && c == ']') ||
    			(a == '(' && c == ')');
    }
    
    public static boolean estaBalanceada(String expre){
        Stack<Character> com = new Stack<>();
        
        for(char caracter : expre.toCharArray()){
        	if(apertura(caracter)){
        		com.push(caracter);
        	}else if(cierra(caracter)){
        		if(com.isEmpty() || !parValido(com.pop(), caracter)){
        			return false;
        		}
        	}
        }
        return com.isEmpty();
    }

    public static void main(String[] args) {
        String entrada;
        System.out.print("Por favor ingrese una expresion: ");
        entrada = sc.nextLine();
        if(estaBalanceada(entrada)){
            System.out.print("Expresion Balanceada");
        }else{
            System.out.print("Expresion no balanceada");
        }
    }
}
