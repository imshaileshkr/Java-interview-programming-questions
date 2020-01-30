import java.util.Scanner;

public class FindLargestAndSmallestElement{
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		final int size = sc.nextInt();

		final int[] array = new int[size];

		System.out.println("Enter the array element");
		for (int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		
		// Initialize the first element as Largest and Smallest-----------------

		int max=array[0], min = array[0], i;

		for(i=0;i<size;i++){
			if(array[i]>max){
				max=array[i];
			}
			else if(array[i]<min){
				min= array[i];
			}
		}
		System.out.println("Largest element is :"+ max);
		System.out.println("Smallest element is :"+ min);
		sc.close();
	}
}