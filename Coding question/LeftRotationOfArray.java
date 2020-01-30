import java.util.Scanner;

public class LeftRotationOfArray{

	// Function for left Rotaion------------------
	void leftRotation(int[] array , int length, int n){

		for (int i=0;i<n;i++) {
			int first, j;

			first=array[0];

			for(j=0;j<length-1;j++){
				// shift by one element
				array[j] = array[j+1];
			}
			array[j] = first;
		}
		System.out.println("After rotation ");
		for (int k=0;k<length;k++) {
			System.out.print(array[k]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int length = sc.nextInt();

		int[]  array = new int[length];
		
		for (int i=0;i<length;i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println("Enter the number of Rotation");
		int n = sc.nextInt();

		LeftRotationOfArray left = new LeftRotationOfArray();
		left.leftRotation(array, length, n);
		sc.close();
	}
}