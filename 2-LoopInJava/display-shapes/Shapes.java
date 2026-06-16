import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        int number = -1;
        String text ="";
        int width = 50;
        int leftPadding;
        Scanner input = new Scanner(System.in);
        
        while (number!=8){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("The corner is square at 4 different angles: top-left, top-right, botttom-left, bottom-right");
            System.out.println("2. bottom-left");
            System.out.println("3. bottom-right");
            System.out.println("4. top-left");
            System.out.println("5. top-right");
            System.out.println("6. Print isosceles triangle");
            System.out.println("7. Exit");
            System.out.print("Enter a number: ");
            number = input.nextInt();
            switch(number) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    for (int i = 0; i<3; i++) {
                        for (int j = 0; j<7; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2: 
                    System.out.println("2. bottom-left");
                    for (int i = 0; i<5; i++){
                        for (int j = 0; j<i+1; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("3. bottom-right");
                    for (int i = 0; i<5; i++){
                        for (int j = 0; j<i+1; j++){
                            text += "* ";
                        }
                        System.out.printf("%10s", text);
                        System.out.println("");
                        text ="";
                    }
                    break;
                case 4: 
                    System.out.println("4. top-left");
                    for (int i = 0; i<5; i++){
                        for (int j = 5-i; j>0; j--){
                            text += "* ";
                        }
                        System.out.printf("%-10s", text);
                        System.out.println("");
                        text ="";
                    }
                    break;
                case 5: 
                    System.out.println("5. top-right");
                    for (int i = 0; i<5; i++){
                        for (int j = 5-i; j>0; j--){
                            text += "* ";
                        }
                        System.out.printf("%10s", text);
                        System.out.println("");
                        text ="";
                    }
                    break;
                case 6: 
                    System.out.println("6. Print isosceles triangle");
                    // for (int i = 0; i<5; i++){
                    //     for (int j = 0; j<i+1; j++){
                    //         text += "* ";
                    //     }
                    //     System.out.printf("%10s", text);
                    //     System.out.printf("%-10s",text);
                    //     System.out.println("");
                    //     text ="";
                    // }
                    
                    for (int i = 0; i<5; i++){
                        for (int j = 0; j<i+1; j++){
                            text += "* ";
                        }
                        leftPadding = (width-text.length())/2;
                        System.out.printf("%" + (leftPadding+text.length()) + "s\n" , text);
                        System.out.println("");
                        text ="";
                    }
                    break;
                case 7: 
                    System.out.println("6. Print Inverted isosceles triangle");
                    // for (int i = 0; i<5; i++){
                    //     for (int j = 5-i; j>0; j--){
                    //         text += "* ";
                    //     }
                    //     System.out.printf("%10s", text);
                    //     System.out.printf("%-10s", text);
                    //     System.out.println("");
                    //     text ="";
                    // }

                    for (int i = 0; i<5; i++){
                        for (int j = 5-i; j>0; j--){
                            text += "* ";
                        }
                        leftPadding = (width-text.length())/2;
                        System.out.printf("%" + (leftPadding+text.length()) + "s\n" , text);
                        System.out.println("");
                        text ="";
                    }
                    break;
                    
                default: 
                    System.exit(0);
            }
        }

    }
}
