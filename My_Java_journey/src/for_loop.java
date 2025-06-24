import java.util.Scanner;
public class for_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long amount=1,total=0;
        System.out.println("enter no of days");
        int i,n=sc.nextInt();


        for(i=1; i <= n; i++){
            total=total+amount;
            System.out.println("amount at Day "+ (i) + " is Rs: "+ amount);
            amount=amount*2;


        }
        System.out.println("Your Final investment after doubling up for " + n +" days every day is Rs" + total);
    }

}
