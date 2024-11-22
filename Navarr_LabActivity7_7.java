import java.util.Scanner;
public class Navarr_LabActivity7_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a Pattern\n Input Number: ");
        int input = sc.nextInt();
        String star = "*";
        
        for (int i = 0 ; i < input; i++) 
        {
            for (int x = 0; x <= i; x++){
                System.out.print(star);
            }
            System.out.print("\n");
        }
        
        
    }
}