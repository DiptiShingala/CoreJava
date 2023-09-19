public class NestedConditions {
    public static void main(String[] args){
        int age = 50;
        if(age < 16)
        {
            System.out.println("you are not eligible");
        }
        else if (age >= 16 && age <= 19)
        {
            System.out.println("you can not drive on 400 highways");
        }
        else if(age>19 && age<=65)
        {
            System.out.println("you are eligible to drive");
        }
        else
        {
            System.out.println("Need to take permission from wife");
        }

    }

}
