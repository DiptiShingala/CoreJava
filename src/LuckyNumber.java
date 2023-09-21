import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Enter lucky number");
        int luckyNumb = scanner.nextInt();
        System.out.println("You can try 5 times");
        for(i=1;i<=6;i++) {

            if(i<=5) {
                int result = scanner.nextInt();
                if (result == luckyNumb) {
                    System.out.println("You are lucky");
                    break;
                }
                else {

                    System.out.println("please try again");
                }
            }
            else {
                System.out.println("you already did 5 times,better luck next time");
            }
        }

        }
}
