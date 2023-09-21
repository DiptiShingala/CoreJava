public class ForLoopOdd {
    public static void main(String[] args){
        int i;
        int sum = 0;
        for(i=1;i<=100;i++){
            if(i%2!=0) {
                sum = sum + i;
                System.out.println("Odd Numbers:" +i);
            }
        }
        System.out.println("Sum of numbers" +sum);
    }
}
