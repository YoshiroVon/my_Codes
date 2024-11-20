import java.util.Scanner;
public class vending_machine
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Soda - $1.50\n" + 
                        "2: Chips - $1.00\n" + 
                        "3: Candy - $0.75\n" + 
                        "4: Water - $1.25\n" +
                        "Select: ");
        int snack = sc.nextInt();
        double price = 0;
        switch (snack) {
            case 1:
                price = 1.50;
                break;
            case 2:
                price = 1.00;
                break;
            case 3:
                price = 0.75;
                break;
            case 4:
                price =1.25;
                break;
            default:
            System.out.print("Invalid Selection");
            System.exit(0);
                break;
        }
        System.out.println("Insert Money: ");
        double bill = sc.nextDouble();
        if (bill >= price ) {
            double change = bill - price;
            if (change > 0){
            System.out.println("Transaction Successfully. Change: $" +change);
            }
            else {
            System.out.println("Transaction Successful");
            }
        }
        else {
            double shortw = price - bill;
            System.out.println("Transaction Failed \n" +
                                "You are short of $ " +shortw);
        }
    }
}