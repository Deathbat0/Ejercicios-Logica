
import java.util.Arrays;

/**
 * @author DeathbatO
 */

public class OrdenLista {
	
	/**
	 * Funcion implementada para ordenar la lista que se proporcione de manera
	 * ascendente o descendente dependiendo del parametro ord
	 * @param list - Lista a ordenar (enteros)
	 * @param ord - Orden en que se quiere dejar la lista ("Asc" o "Desc")
	 * @return Retorna la lista ordenada de manera que se le ha asignado
	 */
	public static int[] OrderList(int list[], String ord){

		if(ord.equals("Asc")){
			for(int i = 0; i < list.length - 1; i++){
				for(int j = 0; j < list.length - 1; j++){
					if(list[j] > list[j+1]){
						int temp = list[j];
						list[j] = list[j + 1];
						list[j+1] = temp;
					}
				}
			}
		}else if(ord.equals("Desc")){
			for(int i = 0; i < list.length - 1; i++){
				for(int j = 0; j < list.length - 1; j++){
					if(list[j] < list[j+1]){
						int temp = list[j];
						list[j] = list[j + 1];
						list[j+1] = temp;
					}
				}
			}
		}else{
			System.out.println("ERROR: Metodo de ordenamiento invalido");
		}
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list1[] = {2, 4, 6, 8, 9};
		int list2[] = {1, 24, 54, 62, 36, 0, 84};
		
		System.out.println("Ordenar las listas ");
		System.out.println("Primera lista:  ");
		System.out.println(Arrays.toString(list2));
		System.out.println("Ordenada:");
		System.out.println(Arrays.toString(OrderList(list2, "Asc")));
		System.out.println("Segunda lista:  ");
		System.out.println(Arrays.toString(list1));
		System.out.println("Ordenada:");
		System.out.println(Arrays.toString(OrderList(list1, "Desc")));
	}

}