import java.util.Scanner;

/*public class InvertedStar {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}*/
/*public class InvertedStar {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }

        }
    }
}*/
public class InvertedStar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println((number<0)?"Negative":"Positive");

    }
}


