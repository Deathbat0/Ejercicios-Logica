// DeathbatO

public class IterationMaster {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int count = 1;

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
            arr[i-1] = i;
        }

        for(int i : arr){
            System.out.println(i);
        }

        while(count <= 100){
            System.out.println(count);
            count++;
        }

        count = 1;
        do{
            System.out.println(count);
            count++;
        }while(count <= 100);
        
    }
}
