
public class NumerosPerdidos{

    public static boolean ValidarArray(int [] arr){
        if(arr.length == 0){
            System.out.println("Error: Arreglo vacio");
            return false;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= arr[i+1]){
                System.out.println("ERROR: Arreglo no ordenado o elemento repetido");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 5, 6, 9};
        int [] arr2 = {1, 2, 6, 7, 6, 9};
        int [] arr3 = {1, 2, 3, 10, 6, 9};
        int [] arr4 = {};

       
        System.out.println("Validez del array: "+ValidarArray(arr4));
    
    }

}