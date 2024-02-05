// DeathbatO

import java.util.Arrays;

public class CarreraObstaculos{
	
	public static boolean pasoCarrera(String pista[], String atleta[]){
		if(pista.length == atleta.length){
			String res[] = new String[pista.length];
			for(int i = 0; i < pista.length; i++){
				if((pista[i] == "_" && atleta[i] == "run") || (pista[i] == "|" && atleta[i] == "jump")){
					res[i] = pista[i];
				}else if(pista[i] == "_" && atleta[i] == "jump"){
					res[i] = "x";
				}else if(pista[i] == "|" && atleta[i] == "run"){
					res[i] = "/";
				}
			}
			if(Arrays.equals(res, pista)){
				System.out.println("Completo la carrera correctamente: ");
				System.out.print(Arrays.toString(res));
				return true;
			}else{
				System.out.println("No completo la carrera correctamente: ");
				System.out.print(Arrays.toString(res));
				return false;
			}
		}else{
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p1[] = {"_","_","|","_","_","_","|","_"};
		String a1[] = {"run","run","jump","run","run","run","jump","run"};
		String p2[] = {"_","|","_","|","_","_","|","_"};
		String a2[] = {"run","jump","run","jump","jump","run","run","jump"};
		
		System.out.println("Primera pista y recorrido: ");
		System.out.println(Arrays.toString(p1));
		System.out.println(Arrays.toString(a1)+"\n");
		pasoCarrera(p1, a1);
		System.out.println("\n\nSegunda pista y recorrido: ");
		System.out.println(Arrays.toString(p2));
		System.out.println(Arrays.toString(a2)+"\n");
		pasoCarrera(p2, a2);
	}
}