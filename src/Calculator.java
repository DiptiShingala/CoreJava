import java.util.Scanner;

//press 1 for addition
//press 2 for subtraction
//press 3 for multiplication
//press 4 for division
//press 5 for modulus
public class Calculator {
    public static void main(String[] args)
    {
        float result;
        System.out.println("welcome to my calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        float numb1 = scanner.nextFloat();
        System.out.println("Enter second Number");
        float numb2 = scanner.nextFloat();
        // Create a Scanner object
        System.out.println("Enter operation");
        int operation = scanner.nextInt();
        System.out.println(operation);
        System.out.println("welcome to my calculator");
        if(operation == 1){
            result = numb1 + numb2;
            System.out.println("Addition of two numbers" +result);
        }
        else if(operation == 2){
            result = numb1 - numb2;
            System.out.println("Subtraction of two numbers"  +result);
        }
        else if(operation == 3){
            result = numb1 * numb2;
            System.out.println("Multiplication of two numbers"  +result);
        }

        else if(operation ==4){
            result = numb1 / numb2;
            System.out.println("Division of two numbers"  +result);
        }
        else if(operation ==5){
            result = numb1 % numb2;
            System.out.println("Modulus of two numbers"  +result);
        }
        else{
            System.out.println("Please enter valid number");
        }

    }
}
