//DeathbatO

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Conjuntos {
	
	public static List<Integer> ComunoNo(int arr1[], int arr2[], boolean bite){
		if(bite){
			Set<Integer> c1 = new HashSet<>();
	        Set<Integer> c2 = new HashSet<>();
	        List<Integer> elemCom = new ArrayList<>();
	        
	        for(int num : arr1){
	            c1.add(num);
	        }

	        for(int num : arr2){
	            c2.add(num);
	        }

	        for(int num : c1){
	            if (c2.contains(num)) {
	                elemCom.add(num);
	            }
	        }

	        return elemCom;
			
		}else{
			Set<Integer> c1 = new HashSet<>();
	        Set<Integer> c2 = new HashSet<>();
	        List<Integer> elemNoCom = new ArrayList<>();
	        
	        for(int num:arr1){
	        	c1.add(num);
	        }
	        
	        for(int num:arr2){
	        	c2.add(num);
	        }
	        
	        for(int num : c1){
	        	if(!c2.contains(num)){
	        		elemNoCom.add(num);
	        	}
	        }
	        
	        return elemNoCom;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {4, 5, 6, 7, 8, 9};
        
        List<Integer> res1 = ComunoNo(array1, array2, true); 
        List<Integer> res2 = ComunoNo(array1, array2, false);
        
        System.out.println("Resultado con true: "+res1);
        System.out.print("Resultado con false: "+res2);
        
	}

}