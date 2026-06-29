import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n: ");
        int n = input.nextInt();
        System.out.println("Các ước của số nguyên n là: ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                System.out.print(i + ",");
            }
        }
        
    }
    
}
