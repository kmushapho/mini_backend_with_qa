public class primeNumbers {
    public static boolean IsPrime(int num){

        for (int i = 2; i < num ; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true && num >= 2;
    }
}
