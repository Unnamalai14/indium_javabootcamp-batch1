import java.util.Scanner;
import java.util.InputMismatchException;

public class CmdLine

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double num1, num2, res;

        System.out.println("Enter the First Number: ");
        try
        {
            num1 = scan.nextDouble();
        }
        catch(InputMismatchException e)
        {
            System.out.println("\nInvalid Input!");
            System.out.println("Exception Name: " + e);
            return;
        }

        System.out.println("Enter the Second Number: ");
        try
        {
            num2 = scan.nextDouble();
        }
        catch(InputMismatchException e)
        {
            System.out.println("\nInvalid Input!");
            System.out.println("Exception Name: " + e);
            return;
        }

        res = num1 + num2;
        System.out.println("\nAddition Result = " + res);
        res = num1 - num2;
        System.out.println("Subtraction Result = " + res);
        res = num1 * num2;
        System.out.println("Multiplication Result = " + res);
        res = num1 / num2;
        System.out.println("Division Result = " + res);
    }
}