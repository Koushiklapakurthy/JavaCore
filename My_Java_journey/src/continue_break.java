public class continue_break {
    public static void main(String[] args){
        int i=0, j=0,k=0;
        System.out.println("for loop output");
        for(i=0;i<=10;i++){
            if(i==5){

                continue;
            }
            else if (i==9){
                break;
            }
            System.out.println(i);
        }
        System.out.println("while loop output");
        while (j<=10){
            if (j==5){
                j++;
                continue;

            }
            else if(j==9){
                break;
            }
            System.out.println(j);
            j++;


        }
        System.out.println("Do while loop output");
        do {
            if (k==5){
                k++;
                continue;

            }
            else if(k==10){
                break;
            }
            System.out.println(k);
            k++;

        }while (k<=10);

    }
}
