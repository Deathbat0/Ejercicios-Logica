public class EsPrimo {
    public static boolean esPrimo(int num){
        if(num == 2 || num == 7 || num == 5 || num == 3 || num == 11){
            return true;
        }else if(num % 2 == 0||num % 3 == 0||num % 5 == 0||num % 7 == 0||num % 11 == 0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }
}
