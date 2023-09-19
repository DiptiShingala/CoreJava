import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        int numb1 = scanner.nextInt();
        System.out.println("Enter second Number");
        int numb2 = scanner.nextInt();
        System.out.println("Enter input");
        String input = scanner.next();

        switch (input) {
            case "+":
                int sum = numb1 + numb2;
                System.out.println("Sum is " +sum);
                if(sum>10)
                {
                    System.out.println("sum is bigger than 10 ");
                }
                else
                {
                    System.out.println("sum is less than 10 ");
                }
                break;
            case "-":
                int sub = numb1 - numb2;
                System.out.println("Subtraction is " +sub);
                if(sub>10)
                {
                    System.out.println("sub is bigger than 10 ");
                }
                else
                {
                    System.out.println("sub is less than 10 ");
                }
                break;
            case "/":
                int div = numb1 / numb2;
                System.out.println("Division is " +div);
                if(div>10)
                {
                    System.out.println("Division is bigger than 10 ");
                }
                else
                {
                    System.out.println("Division is less than 10 ");
                }
                break;
            case "*":
                int mul = numb1 * numb2;
                System.out.println("Multiplication is " +mul);
                break;
            case "%":
                int modulus = numb1 % numb2;
                System.out.println("Modulus is " +modulus);
                break;
            default:
                System.out.println("Wrong Numbers");

        }
    }
}
