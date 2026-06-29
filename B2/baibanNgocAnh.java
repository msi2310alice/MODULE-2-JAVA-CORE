import java.util.Scanner;
    public class baibanNgocAnh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so bat ki: ");
        double x = Double.parseDouble(scanner.nextLine());

        System.out.print("=> Uoc so cua " + x + " la: 1, ");

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                int y = (int) x / i;
                if (y != i) {
                    System.out.print(i + ", " + y + ", ");
                }
            }
        }
        System.out.print((int) x);
    }
    
}
