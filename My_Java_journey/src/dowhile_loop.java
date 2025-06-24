import java.util.Scanner;
public class dowhile_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int guess;
        int secret_number=9;
        System.out.println("Guess the secret number between 0 to 9");
        do {
            System.out.println(("Enter Your Number"));
            guess= sc.nextInt();
            if(guess != secret_number){
                System.out.println("Sorry Wrong Guess.. Try again!!");


            }
        }while(guess != secret_number);




            System.out.println("Congratulaions!! Your guess is correct");



    }
}
