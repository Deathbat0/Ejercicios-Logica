public class Fibonacci {   
    public static void main(String[] args) {
        double serie[] = new double [50];
        serie[0] = 0;
        serie[1] = 1;
        for(int i = 2; i < 50; i++){
            serie[i] = serie[i-1] + serie[i-2];
        }
        for(int i = 0; i < 50; i++){
            System.out.println("Item "+(i+1)+" : "+serie[i]);
        }
    }
}