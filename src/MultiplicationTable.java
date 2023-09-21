public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 1;
        int mul = 2;
        int result;
        do {
            result =  number * mul;
            System.out.println(mul+  "*"  +number+ "=" +result);
            number++;
        }while(number <= 10);

    }
}
