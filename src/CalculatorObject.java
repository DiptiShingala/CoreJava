import java.util.Scanner;
public class CalculatorObject {
    public double sum(double num1, double num2) {
        return num1 + num2;

    }
    public double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;

    }
    public double sub(double num1, double num2) {
        return num1 - num2;

    }

    public double sub(double num1, double num2,double num3) {
        return num1 - num2 - num3;

    }

    public double mul(double num1, double num2) {
        return num1 * num2;

    }
    public double mul(double num1, double num2,double num3) {
        return num1 * num2 * num3;

    }
    public double div(double num1, double num2) {
        return num1 * num2;

    }
    public double div(double num1, double num2,double num3) {
        return num1 / num2 / num3;

    }
    public static void main(String[] args) {
        char choice;

        System.out.println("Welcome to calculator");
        System.out.println("Press 1 for Summation");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your input");
            int input = scanner.nextInt();
            CalculatorObject cal = new CalculatorObject();

            switch (input) {
                case 1:
                    System.out.println("Welcome to summation");
                    do {
                        System.out.println("How many numbers u want to sum");

                        int number = scanner.nextInt();

                        if (number == 2) {
                            System.out.println("Sum" + cal.sum(13, 20));
                        } else if (number == 3) {
                            System.out.println("Sum" + cal.sum(13, 20, 6));
                        } else {
                            System.out.println("u can add just 2 or 3 numbers");
                        }
                        System.out.println("Do u want to continue with summation:?Y:N");
                        choice = scanner.next().charAt(0);
                    } while (choice != 'N');
                    break;
                case 2:
                    System.out.println("Welcome to subtraction");
                    do {
                        System.out.println("How many numbers u want to sub");
                        int sub = scanner.nextInt();
                        if (sub == 2) {
                            System.out.println("Sub" + cal.sub(13, 20));
                        } else if (sub == 3) {
                            System.out.println("Sub" + cal.sub(13, 20, 6));
                        } else {
                            System.out.println("u can sub just 2 or 3 numbers");
                        }
                        System.out.println("Do u want to continue with subtraction:?Y:N");
                        choice = scanner.next().charAt(0);
                    }
                    while (choice != 'N');
                    break;
                case 3:
                    System.out.println("Welcome to multiplication");
                    do {
                        System.out.println("How many numbers u want to mul");
                        int mul = scanner.nextInt();
                        if (mul == 2) {
                            System.out.println("Sub" + cal.mul(13, 20));
                        } else if (mul == 3) {
                            System.out.println("Sub" + cal.mul(13, 20, 6));
                        } else {
                            System.out.println("u can mul just 2 or 3 numbers");
                        }
                        System.out.println("Do u want to continue with multiplication:?Y:N");
                        choice = scanner.next().charAt(0);
                    }
                    while (choice != 'N');
                    break;
                case 4:
                    System.out.println("Welcome to division");
                    do {
                        System.out.println("How many numbers u want to div");
                        int div = scanner.nextInt();
                        if (div == 2) {
                            System.out.println("Sub" + cal.div(13, 20));
                        } else if (div == 3) {
                            System.out.println("Sub" + cal.div(13, 20, 6));
                        } else {
                            System.out.println("u can div just 2 or 3 numbers");
                        }
                        System.out.println("Do u want to continue with division:?Y:N");
                        choice = scanner.next().charAt(0);
                    }
                    while (choice != 'N');
                    break;
                default: {
                    System.out.println("please enter valid input");
                }

            }
            System.out.println("Do u want to continue with another option:?Y:N");
            choice = scanner.next().charAt(0);
        } while (choice != 'N');
    }
}
