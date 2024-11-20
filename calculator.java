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
        switch (operator =  '+')
        {
            case '+':
            {
                System.out.println(result = i + o);
                break;    
            }
            case '-':
            {
                System.out.println(result = i - o);
                break;
            }
            case '*':
            {
                System.out.println(result = i * o);
                break;
            }
            case '/':
            {
                System.out.println(result = i / o);
                break;
            }
            default:
            {
                System.out.println("Invalid input");
            }
        } 
    }
}