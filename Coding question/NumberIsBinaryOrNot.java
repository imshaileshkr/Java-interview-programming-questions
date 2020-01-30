import java.util.Scanner;

public class NumberIsBinaryOrNot {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("i am waiting for your input, please enter the Number : ");
        int number  = sc.nextInt();
        int copyOfNumber = number;
        boolean isBinary = true;

        while(number !=0){
            int temp = number%10;
            if(temp > 1){
                isBinary = false;
                break;
            }
            else{
                number = number/10;
            }
        }
        if(isBinary)
            System.out.println("This is a Binary number :"+copyOfNumber);
        else
        System.out.println("This is not a Binary number :"+copyOfNumber);
        sc.close();
    }
}