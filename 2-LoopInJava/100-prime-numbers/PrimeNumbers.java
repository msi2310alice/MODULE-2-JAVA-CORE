
public class PrimeNumbers {
    public static void main(String[] args) {
        boolean check;
        String text ="";
        
        for (int i=2; i<=100; i++){
            check = checkPrime(i);
            if (check) {
                text += i + ";";
            }
        }
        System.out.print("Prime numbers less than 100:" + text);
    }
    public static Boolean checkPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
