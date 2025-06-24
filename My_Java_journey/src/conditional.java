import java.util.Scanner;

public class conditional {
    public static void main(String[] args ){


       // System.out.println("Is The Sun Up?");
        System.out.println("Please Deposit your Cash");
        Scanner sc = new Scanner(System.in);
                /*boolean isSunup = sc.nextBoolean();


        if(isSunup==true)
            System.out.println("day");
        else
            System.out.println("night");*/
        /*int age = sc.nextInt();
        if(age>=18) {
            System.out.println("eeroju naa 18th birthday..");
            System.out.println("Chandra sekhar will hug Jabilli");
        }
        else {
            System.out.println("POCSO case lo jail ki pora chandra sekhar");
        }*/
//pen=10 book=40
        int cash = sc.nextInt();
        if (cash<10){
            System.out.println("Cannot buy anything");
            System.out.println("Please Deposit More Cash");
        }
        else if(cash>=10 && cash<50){
            System.out.println("Can either buy pen or book");
            System.out.println("Enter 1 to buy pen");
            System.out.println("Enter 2 to buy book");
            Scanner sc1= new Scanner(System.in);
            int selection = sc1.nextInt();
            if(selection==1){
                System.out.println("Please collect your pen");
                int change= cash-10;
                System.out.println("Please collect your change Rs "+ change);
            }
            else if(selection==2 && cash>=40){
                System.out.println("Please Collect your book");
                int change= cash-40;
                System.out.println("Please collect your change Rs "+ change);
            }
            else{
                System.out.println("Insufficient amount. Please select items equivalent to the deposited cash ");
            }

        }
        else {
            System.out.println("Can buy pen,book or both");
            System.out.println("Enter 1 to buy pen");
            System.out.println("Enter 2 to buy book");
            System.out.println("Enter 3 to buy both");
            Scanner sc1= new Scanner(System.in);
            int selection = sc1.nextInt();
            if((selection==1 || selection==2) && cash>=50 ){
                if(selection==1) {
                    System.out.println("Please Collect your Pen");
                    int change = cash-10;
                    System.out.println("Please Collect your Change Rs " + change);
                }
                else if(selection==2) {
                    System.out.println("Please Collect your Book");
                    int change = cash-40;
                    System.out.println("Please Collect your Change Rs " + change);
                }
            }
            else {
                System.out.println("Please Collect your Pen & Book");
                int change = cash-50;
                System.out.println("Please Collect your Change Rs " + change);
            }


        }



    }
}
