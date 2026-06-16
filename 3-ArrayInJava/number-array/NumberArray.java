import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Size should not exceed 20.");
            } 
        } while (size>20);
    }
    
}
