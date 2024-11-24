import java.util.Scanner;
public class Navarro_LabActivity7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        System.out.print("Print Squares of Numbers\n Input Number: ");
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            result = i * i;

            System.out.printf("%d⌃2=%d%n",i ,result);
        }
        
    }
}