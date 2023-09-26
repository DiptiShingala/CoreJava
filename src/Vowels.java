import java.util.Scanner;

public class Vowels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter character:");
            char c = scanner.next().charAt(0);
            if (c == 'a' || c == 'i' || c == 'o' || c == 'u'|| c=='e') {
                System.out.println("Character is vowel");
            }
            else {
                System.out.println("Character is consonant");
            }
            System.out.println("Do u continue:Y or N");
            choice = scanner.next().charAt(0);
        }while(choice!='N');
    }
}
