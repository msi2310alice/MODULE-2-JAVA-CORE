import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int N = 2;
        String text ="";
        boolean isPrime;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of prime numbers: ");
        numbers = input.nextInt();

        while(count<numbers){
            isPrime = true;
            for (int i = 2; i<=Math.sqrt(N); i++){
                if (N%i == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                text += N + " ;";
                count++;
            }  
            N++;
        }
        System.out.print("The first" + numbers + " prime numbers: " + text);
    }
}
