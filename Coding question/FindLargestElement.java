import java.util.Scanner;

public class FindLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the array element");
		for (int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}

		int min,max,i;

		// Initializing the max and min value----------
		max=array[0];
		min = array[0];

		for(i=0;i<size;i++){

			// Find  Largest element---------------
			if(array[i]>max){
				max=array[i];
			}

			// Find Smallest element------------
			else if(array[i]<min){
				min= array[i];
			}
		}
		System.out.println("Largest element is :"+ max);
		System.out.println("Smallest element is :"+ min);
		sc.close();
	}
}