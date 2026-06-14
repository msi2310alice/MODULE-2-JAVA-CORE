import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String word;
        if ((number>0)&&(number<10)) {
            word = lessThan10(number);
        } else if (number <20) {
            word = lessThan20(number);
        } else if (number <100) {
            word = lessThan100(number);
        } else if (number<1000) {
            word = lessThan1000(number);
        } else {
            word = "Out of ability!";
        }
        System.out.printf("Number to text: %s", word);
    }
    public static String lessThan10(int number) {
        String text;
        switch (number) {
                case 1:
                    text = "One";
                    break;
                case 2: 
                    text = "Two";
                    break;
                case 3:
                    text = "Three";
                    break;
                case 4: 
                    text = "Four";
                    break;
                case 5:
                    text = "Five";
                    break;
                case 6:
                    text = "Six";
                    break;
                case 7:
                    text = "Seven";
                    break;
                case 8: 
                    text = "Eight";
                    break;
                default:
                    text = "Nine";
                    break;   
            }
            return text;
    }
    public static String lessThan20(int number) {
        String text;
        int remainder = number % 10;
        switch (remainder) {
            case 1:
                text = "eleven";
                break;
            case 2: 
                text = "twelve";
                break;
            case 3:
                text = "thirteen";
                break;
            case 4: 
                text = "fourteen";
                break;
            case 5:
                text = "fifteen";
                break;
            case 6:
                text = "sixteen";
                break;
            case 7:
                text = "seventeen";
                break;
            case 8: 
                text = "eighteen";
                break;
            default:
                text = "nineteen";
                break;
        } 
        return text;   
    }
    public static String lessThan100(int number) {
        String text;
        int remainder1 = number%10;
        String onesDigit;
        int remainder2 = (number%100)/10;
        String tensDigit;
        
        onesDigit = lessThan10(remainder1);
        switch (remainder2) {
            case 2:
                tensDigit = "Twenty";
                break;
            case 3:
                tensDigit = "thirty";
                break;
            case 4:
                tensDigit = "forty";
                break;
            case 5:
                tensDigit = "fifty";
                break;
            case 6:
                tensDigit = "sixty";
                break;
            case 7:
                tensDigit = "seventy";
                break;
            case 8:
                tensDigit = "eighty";
                break;
            default:
                tensDigit = "ninety";
        }
        text = tensDigit + "-" + onesDigit;
        return text;

    }
    public static String lessThan1000(int number) {
        String text;
        // int remainder1 = number%10;
        // String onesDigit;
        int remainder2 = number%100;
        String tensDigit;
        int remainder3 = (number%1000)/100;
        String hundredsDigit;

        // onesDigit = lessThan10(remainder1);
        if ((remainder2>10)&&(remainder2<20)) {
            tensDigit = lessThan20(remainder2);
        } else {
            tensDigit = lessThan100(remainder2);
        }

        hundredsDigit = lessThan10(remainder3)+"hundred";
        text = hundredsDigit + " and " + tensDigit;
        
        return text;
    }

}
