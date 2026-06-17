import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int index_del;
     
        do {
            index_del = -1;
            for (int i=0; i<array.length; i++){
                if (input == array[i]){
                    index_del = i;
                }
            }
            if (index_del!=-1){
                for (int i=index_del; i<array.length-1; i++){
                    array[i] = array[i+1];
                }
            }
            
        }while (index_del!=-1);
        System.out.print("Array after deletion: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }
        
        
    }
}
