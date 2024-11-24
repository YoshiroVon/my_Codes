import java.util.Scanner;
public class Navarro_Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input your Transactional number");
       int Transac = sc.nextInt();
       int sum_of = 0;
       int left;
       while (Transac > 0){
           left = Transac%10;
           sum_of = sum_of + left;
           Transac = Transac / 10;
       }
       System.out.println("The Sum of your Transactional Number is " +sum_of);
    }
    
}