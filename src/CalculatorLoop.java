import java.util.Scanner;

public class CalculatorLoop
{
    public static void main(String[] args)
    {
        float numb1,numb2,res;
        char op;
        Scanner scanner=new Scanner(System.in);
        do
        {
            System.out.println("\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\n");
            System.out.print("Enter your choice : ");
            op=scanner.next().charAt(0);
            switch(op)
            {
                case '1':
                    System.out.print("Enter two numbers : ");
                    numb1=scanner.nextFloat();
                    numb2=scanner.nextFloat();
                    res=numb1+numb2;
                    System.out.print("Result : " +res);
                    break;

                case '2':
                    System.out.print("Enter two numbers : ");
                    numb1=scanner.nextFloat();
                    numb2=scanner.nextFloat();
                    res=numb1-numb2;
                    System.out.print("Result : " +res);
                    break;

                case '3':
                    System.out.print("Enter two numbers : ");
                    numb1=scanner.nextFloat();
                    numb2=scanner.nextFloat();
                    res = numb1 * numb2;

                    System.out.print("Result : " +res);
                    break;

                case '4':
                    System.out.print("Enter two numbers : ");
                    numb1=scanner.nextFloat();
                    numb2=scanner.nextFloat();
                    res = numb1 / numb2;
                    System.out.print("Result : " +res);
                    break;

                case '5':
                    System.exit(0);
                    break;
                default : System.out.print("Wrong Choice.....\n");
                    break;
            }
        }

        while(op!=5);
    }
}