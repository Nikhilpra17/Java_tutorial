import java.util.Scanner;

public class Input{
    public static void input (String[] args){
        System.out.println("Taking input from user");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = obj.nextfloat();
        System.out.println("Enter the second number");
        float b = obj.nextfloat();
        float sum = a+b;
        System.ot.println(sum);
    }
}