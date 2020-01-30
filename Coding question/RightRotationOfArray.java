import java.util.Scanner;

public class RightRotationOfArray{

	void rightRotation(int[] array, int length, int n){
		for (int i=0;i<n;i++) {
			int j, last;

			// store the last element
			last = array[length-1];
			for (j=length-1;j>0;j-- ) {

				// shifting the element by one 
				array[j]= array[j-1];
			}
			array[0] = last;
		}
		System.out.println("After the Right rotation :");
		for (int i=0;i<length;i++) {
			System.out.print(array[i]+ " ");
		}

	}
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the array element");
		for (int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the number of rotation : ");
		int n = sc.nextInt();
		RightRotationOfArray  right = new RightRotationOfArray();
		right.rightRotation(array, size, n);
		sc.close();
	}
}