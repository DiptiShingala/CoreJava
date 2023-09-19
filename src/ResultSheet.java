public class ResultSheet {
    public static void main(String[] args){
        int marks = 40;
        if(marks>=0 && marks<=40)
        {
            System.out.println("You are failed");
        }
        else if(marks>40 && marks<=60)
        {
            System.out.println("You have B grade");
        }
        else if(marks>60 && marks<=80)
        {
            System.out.println("You are B+ grade");
        }
        else if(marks>80 && marks<=90)
        {
            System.out.println("You have A grade");
        }
        else if(marks>90 && marks<=99)
        {
            System.out.println("You are A+ grade");
        }
        else
        {
            System.out.println("You are alien");
        }
    }

}
