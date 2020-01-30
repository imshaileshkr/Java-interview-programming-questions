import java.util.Scanner;

public class FindSecondLargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");

        int length = sc.nextInt();
        int[] array = new int[length];

        // Taking array elements
        System.out.println("Enter the array elements : ");
        for(int i=0;i<length;i++){
            
            array[i] = sc.nextInt();
        }
        
        int firstLargestElement, secondLargestElement;
        if(array[0] > array[1]){
            firstLargestElement = array[0];
            secondLargestElement = array[1];
        }
        else{
            firstLargestElement = array[1];
            secondLargestElement = array[0];
            
        }
        for(int j=2;j<length;j++){
            if(array[j] > firstLargestElement){

                secondLargestElement = firstLargestElement;
                firstLargestElement = array[j];
                
            }
            else if(array[j] < firstLargestElement && array[j] >secondLargestElement ){
                secondLargestElement = array[j];
            }
           
        }
        
        System.out.println("Second largest Number is : "+ secondLargestElement);
        sc.close();
    }
}