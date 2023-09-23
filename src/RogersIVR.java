import java.util.Scanner;

// press 1 input for English
//press 2 input for French
//press 3 input for Spanish

//press 1 Connection for internet
//press 2 Connection for Mobile
//press 3 Connection for Cable
public class RogersIVR {
    public static void main(String[] args){
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        System.out.println("Press 3 for Spanish");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input");
        int input = scanner.nextInt();
        System.out.println("Enter connection");
        System.out.println("Press 1 for Internet");
        System.out.println("Press 2 for Mobile");
        System.out.println("Press 3 for cable");
        int connection = scanner.nextInt();

       char choice;
        do {
            switch (input) {
                case 1:
                    System.out.println("you have selected English");
                    System.out.println("Enter options");
                    int options = scanner.nextInt();
                    switch (connection) {
                        case 1:
                            System.out.println("Connection is Internet");
                            if (options == 1) {
                                System.out.println("New connection");
                            } else if (options == 2) {
                                System.out.println("Existing connection");
                            } else if (options == 3) {
                                System.out.println("Bill payment");
                            } else if (options == 4) {
                                System.out.println("transfer payment");
                            } else {
                                System.out.println("Enter valid option");
                            }
                            break;
                        case 2:
                            System.out.println("Connection is Mobile");
                            if (options == 1) {
                                System.out.println("mobile data usage");
                            } else if (options == 2) {
                                System.out.println("Recharge mobile data");
                            } else if (options == 3) {
                                System.out.println("Payment of postpaid");
                            } else {
                                System.out.println("Enter valid option");
                            }
                            break;
                        case 3:
                            System.out.println("Connection is Cable");
                            if (options == 1) {
                                System.out.println("New cable connection");
                            } else if (options == 2) {
                                System.out.println("Existing cable connection");
                            } else if (options == 3) {
                                System.out.println("Payment of cable connection");
                            } else {
                                System.out.println("Enter valid option");
                            }
                            break;
                        default: {
                            System.out.println("Enter valid options");
                        }

                    }
                    break;
                case 2:
                    System.out.println("French");
                    break;
                case 3:
                    System.out.println("Spanish");
                    break;
                default:
                    System.out.println("Enter valid input");

            }
            System.out.println("Do u want to continue?Y or N");
            choice= scanner.next().charAt(0);
        }while(choice!='N');
    }

}
