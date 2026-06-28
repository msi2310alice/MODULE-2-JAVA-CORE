import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap gia tri a: ");
        String a = scanner.nextLine();
        System.out.println("Hay nhap gia tri b: ");
        String b = scanner.nextLine();

        double tb = (Integer.parseInt(a)+Integer.parseInt(b))/2;

        System.out.println("Tong cua a va b la:  " + (Integer.parseInt(a)+Integer.parseInt(b)));
        System.out.println("Trung binh cua a va b la:  " + tb);

        scanner.close();
    }
}
