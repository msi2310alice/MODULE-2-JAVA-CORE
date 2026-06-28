import java.util.Scanner;

public class Ptb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 1: ax + b = 0");
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        
        System.out.println("Nhap b:");
        int b = scanner.nextInt();

        if (a == 0 && b !=0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (a ==0 && b ==0) { 
            System.out.println("Phuong trinh vo so nghiem");
        } else {
            double x = -b/a;
            System.out.println("Phuong trinh co nghiem x = "+ x);
        }
        scanner.close();
    }
}
