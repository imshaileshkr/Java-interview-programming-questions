import java.util.Scanner;
public class OddPositionOfArray{


	void oddPosition(int[] array, int size){
			System.out.println("Array element of Odd position : ");
			for (int i=0;i<size;i+=2 ) {
				System.out.print(array[i]+" ");
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
		
		OddPositionOfArray  odd = new OddPositionOfArray();
		odd.oddPosition(array, size);
		sc.close();
	}
}