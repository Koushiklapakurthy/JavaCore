import java.util.Scanner;
public class Functions {
    public static void printname(String name){

        System.out.println("welcome "+name);
    }
    public static void main(String[] args){
        String name= "";

        while (!name.equalsIgnoreCase("DONE")){
            System.out.println("Please Enter Your name");
            Scanner sc= new Scanner(System.in);
             name= sc.next();
             if (!name.equalsIgnoreCase("DONE")) {
                 printname(name);
             }
            else if(name.equalsIgnoreCase("DONE")){
                System.out.println("Program Ended Thank You");
                break;
            }
        }


    }
}
