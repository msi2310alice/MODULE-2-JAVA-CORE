import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int index;
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0 ,0};
        int[] temp_array = new int[10];

        System.out.print("Enter a number:");
        number = scanner.nextInt();
        System.out.print("Enter index: ");
        index = scanner.nextInt();

        if ((index<=-1)||(index>=array.length-1)){
            System.out.println("index can't exceed the size of array.");
        }else{
            for (int i=index; i<array.length; i++){
                temp_array[i] = array[i];
            }
            for (int i = index; i< array.length-1; i++){
                array[i+1] = temp_array[i];
            }
            array[index] = number;
        }
        System.out.print("Array: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }

    }
}
