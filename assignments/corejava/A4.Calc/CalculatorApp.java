import java.util.*;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        float numberOne = reader.nextFloat();
        System.out.println("Enter second Number : ");
        float numberTwo = reader.nextFloat();
        System.out.println("The available operations are : ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice");
        int userChoice = reader.nextInt();
        switch(userChoice) {
            case 1: System.out.println(addition(numberOne, numberTwo));
                break;
            case 2: System.out.println(subraction(numberOne, numberTwo));
                break;
            case 3: System.out.println(multiplication(numberOne, numberTwo));
                break;
            case 4: System.out.println(division(numberOne, numberTwo));
                break;
            default: System.out.println("Enter a valid choice");
                break;
        }
        reader.close();
    }
    public static float addition(float number1, float number2) {
        return number1+number2;
    }

    public static float multiplication(float number1, float number2) {
        return number1*number2;
    }

    public static float subraction(float number1, float number2) {
        return number1-number2;
    }

    public static float division(float number1, float number2) {
        return number1/number2;
    }
}
