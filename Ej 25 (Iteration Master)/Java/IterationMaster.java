
public class IterationMaster {
    public static void main(String[] args) {
        int arr[] = new int[100];

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
            arr[i-1] = i;
        }
    }
}
