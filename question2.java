import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class question2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("The average of "+a+" "+b+" "+c+" is "+(a+b+c)/3);
    }
}
