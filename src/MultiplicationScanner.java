import java.util.Scanner;

public class MultiplicationScanner {
    public static void main(String[] args) {
            int number = 1;
           // int mul = 2;
            int result;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number u want to multiplication of that number");
            int input = scanner.nextInt();
            do {
                result =  number * input;
                System.out.println(input+  "*"  +number+ "=" +result);
                number++;
            }while(number <= 10);


    }

}
