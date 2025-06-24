import java.util.Scanner;
public class switch_case {
    public static void main(String[] args){
        System.out.println("Please Enter your Shift Number ");
        Scanner sc= new Scanner(System.in);
        String Timings = "Your Work timings are ";
        int shift_number = sc.nextInt();
        switch (shift_number) {
            case 1:
                System.out.println(Timings + "6:30AM to 3:00PM");
                break;
            case 2:
                System.out.println(Timings + "2:30PM to 11:00PM");
                break;
            case 3:
                System.out.println(Timings + "10:30PM to 7:00 AM");
                break;
            default:
                System.out.println("Your Shift will be General Shift");
                System.out.println(Timings + "8:30AM to 5:00PM");

        }


    }
}
