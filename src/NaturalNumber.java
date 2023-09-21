public class NaturalNumber {
    public static void main(String[] args){
        int number =1;
        int sum = 0;
        while(number<=10){
            sum = number +sum;
            number++;
        }
        System.out.println(sum);
    }
}
