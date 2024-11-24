import java.util.Scanner;
public class calculator
{
    public static void main (String [] args )
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input first number: ");
        double i = sc.nextDouble();
        System.out.println("Input second number: ");
        double o = sc.nextDouble();
        System.out.println("Input Operator: ");
        char operator = sc.next().charAt(0);
        double result = 0;
        switch (operator)
        {
            case '+':
            {
            result = i + o;
                break;    
            }
            case '-':
            {
                result = i - o;
                break;
            }
            case '*':
            {
            result = i * o;
                break;
            }
            case '/':
            if (o != 0)
            {
                result = i / o;
            }
            else
            {
                System.out.println("Division by zero is not allowed");
                return;
            }
            break;
            default:
            {
                System.out.println("Invalid input");
            }
        } 
        System.out.println(result);
    }
}