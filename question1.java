import java.util.Scanner;

public class question1 {
    public static void main(String arg[]) {
        Scanner input  = new Scanner((System.in));
        System.out.print("Enter a number for radius: ");
        double radius = input.nextFloat();
        double pi = 3.14159;
        double area = radius*radius*pi;
        System.out.println("The ara for the circle of radius "+radius+" is "+area);
    }
}
