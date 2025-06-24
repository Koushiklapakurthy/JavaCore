
import java.util.Scanner;
public class while_loop {
    public static void main(String[] args){
        int fact=1;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial of "+ n + " is "+fact);

    }
}
