public class Calculator {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }
    public static void main(String[] args){

        Calculator c = new Calculator();

        System.out.println("sum is"  +c.sum(10,20));
        System.out.println("sub is"  +c.sub(18,20));
        System.out.println("mul is"  +c.mul(10,22));
        System.out.println("div is"  +c.div(10,20));


    }
}
