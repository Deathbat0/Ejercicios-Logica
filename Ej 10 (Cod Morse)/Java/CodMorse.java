//DeathbatO

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CodMorse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, String> dict = new HashMap<Character, String>();
        Map<String, Character> dict2 = new HashMap<String, Character>();
        String cadena;int len;

        dict.put('A', "·—"); dict.put('B', "—···");
        dict.put('C', "—·—·"); dict.put('D', "—··");
        dict.put('E', "·"); dict.put('F', "··—·");
        dict.put('G', "——·"); dict.put('H', "····");
        dict.put('I', "··"); dict.put('J', "·———");
        dict.put('K', "—·—"); dict.put('L', "·—··");
        dict.put('M', "——"); dict.put('N', "—·");
        dict.put('O', "———"); dict.put('P', "·——·");
        dict.put('Q', "——·—"); dict.put('R', "·—·");
        dict.put('S', "···"); dict.put('T', "—");
        dict.put('U', "··—"); dict.put('V', "···—");
        dict.put('W', "·——"); dict.put('X', "—··—");
        dict.put('Y', "—·——"); dict.put('Z', "——··");
        dict.put('0', "—————"); dict.put('1', "·————");
        dict.put('2', "··———"); dict.put('3', "···——");
        dict.put('4', "····—"); dict.put('5', "·····");
        dict.put('6', "—····"); dict.put('7', "——···");
        dict.put('8', "———··"); dict.put('9', "————·");
        dict.put('.', "·—·—·—"); dict.put(',', "——··——");
        dict.put('?', "··——··"); dict.put(' ', "  ");
        
        for (Map.Entry<Character, String> entry : dict.entrySet()) {
            dict2.put(entry.getValue(), entry.getKey());
        }
        
        System.out.print("\t------Traductor de Codigo Morse-----\n");
        for(int j = 0; j < 5; j++) {
        	System.out.print("\nPor favor digita el texto que deseas traducir: ");
        	cadena = sc.nextLine().toUpperCase(); len = cadena.length();
        	char letra[] = new char [len];
        	if(cadena.contains("·")){
        		StringBuilder text = new StringBuilder();
        		String[] words = cadena.split("   ");
        		for(String word : words){
        			String[] letr = word.split(" ");
        			for(String let : letr){
        				if(dict2.containsKey(let)){
        					text.append(dict2.get(let));
        				}
        			}
        			text.append(" ");
        		}
        		System.out.print(text.toString().trim());
        	}else{
        	 	letra = cadena.toCharArray();
             	for(int i = 0; i <= len-1; i++){
             		if(dict.containsKey(letra[i])){
             			System.out.print(dict.get(letra[i])+" ");
             		}
             	}
        	}
        }
        sc.close();
        System.out.print("\n\n\t-----Programa Finalizado-------");
    }
}
