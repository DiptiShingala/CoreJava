import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println((number<0)?"Negative":"Positive");

    }
}
